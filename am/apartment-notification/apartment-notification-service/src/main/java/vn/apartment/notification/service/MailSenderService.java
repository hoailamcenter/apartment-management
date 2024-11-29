package vn.apartment.notification.service;

import java.util.Date;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import vn.apartment.apartment.core.utils.Dates;
import vn.apartment.notification.document.Mail;
import vn.apartment.notification.dto.enums.MailStatus;

@Service
public class MailSenderService {

    private static final Logger LOG = LoggerFactory.getLogger(MailSenderService.class);

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private MailService mailService;

    public void send(Mail mail) {

        if (mail == null || ObjectUtils.isEmpty(mail.getContent())) {
            LOG.warn("Skip due to empty mail.");
            return;
        }

        SimpleMailMessage msg = newSimpleMailMessage(mail);

        try {

            LOG.info("Sending the mail {}", mail.getId());

            updateMail(mail, MailStatus.IN_PROGRESS);

            javaMailSender.send(msg);

            updateMail(mail, MailStatus.SENT);

            LOG.info("Sent the mail {} on success.", mail.getId());

        } catch (Exception ex) {

            LOG.error("Sent the mail {} on failure.", mail.getId(), ex);

            mail.setError(ex.getMessage());
            mail.nextRetryTime();

            updateMail(mail, MailStatus.FAILED);
        }
    }

    private void updateMail(Mail mail, MailStatus status) {
        Date now = Dates.now();
        mail.setStatus(status);
        mail.setUpdatedOn(now);
        if (MailStatus.SENT.equals(status)) {
            mail.setSentDate(now);
        }
        mailService.saveOrUpdate(mail);
    }

    private SimpleMailMessage newSimpleMailMessage(Mail mail) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(msg.getFrom());
        msg.setTo(mail.getTo().toArray(new String[]{}));
        msg.setBcc(mail.getBcc().toArray(new String[]{}));
        msg.setSubject(mail.getSubject());
        msg.setText(mail.getContent());
        return msg;
    }
}
