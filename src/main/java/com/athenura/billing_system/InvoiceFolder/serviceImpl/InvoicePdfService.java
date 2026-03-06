package com.athenura.billing_system.InvoiceFolder.serviceImpl;

import com.athenura.billing_system.InvoiceFolder.dto.InvoiceResponseDTO;
import com.athenura.billing_system.InvoiceFolder.entity.ThymeleafRenderUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

@Service
@RequiredArgsConstructor
public class InvoicePdfService {

    private final ThymeleafRenderUtil thymeleafRenderUtil;
    
    public byte[] generateInvoicePdf(InvoiceResponseDTO invoiceDTO) {
        Context context = new Context();
        context.setVariable("invoice", invoiceDTO);
        return thymeleafRenderUtil.renderTemplate("invoice", context);
    }
}