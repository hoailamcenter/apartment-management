Dear ${resident_name},

This is your monthly invoice for apartment ${apartment_name}.

Invoice Details:
Invoice ID: ${invoice_id}
Issue Date: ${created_date}
Payment Deadline: ${payment_deadline}
Status: ${status}
Service Details:
    +------------------------+---------------+---------------+---------------+---------------+
    | Service                | Old Value     | New Value     | Amount Used   | Total (VND)   |
    +------------------------+---------------+---------------+---------------+---------------+
<#list service_details as detail>
    | ${detail.service.name?left_pad(22)} | ${detail.old_value?string["0.##"]?right_pad(13)} | ${detail.new_value?string["0.##"]?right_pad(13)} | ${detail.amount_of_using?string["0.##"]?right_pad(13)} | ${detail.money?string?right_pad(13)} |
    +------------------------+---------------+---------------+---------------+---------------+
</#list>

Total Amount: ${total} VND

Please complete your payment before the deadline.

Kind Regards,
The Apartment Management Team