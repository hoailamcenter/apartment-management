package vn.apartment.master.interactor.servicedetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import vn.apartment.core.mvc.anotation.Interactor;
import vn.apartment.master.dto.servicedetail.UpdateServiceDetailDTO;
import vn.apartment.master.entity.service.ServiceDetail;
import vn.apartment.master.mapper.ServiceDetailMapper;
import vn.apartment.master.service.ServiceDetailService;

@Interactor
public class UpdateServiceDetail {

    @Autowired
    private ServiceDetailService serviceDetailService;

    @Autowired
    private ServiceDetailMapper serviceDetailMapper;

    @Transactional
    public void execute(UpdateServiceDetailDTO serviceDetail) {
        ServiceDetail hadServiceDetail = serviceDetailService.findServiceDetailById(serviceDetail.getServiceDetailId());
        serviceDetailMapper.updateEntity(serviceDetail, hadServiceDetail);
        serviceDetailService.saveOrUpdate(hadServiceDetail);
    }
}
