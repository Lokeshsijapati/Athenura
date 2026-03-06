package com.athenura.billing_system.InvoiceFolder.services;

import com.athenura.billing_system.InvoiceFolder.dto.InvoiceRequestDTO;
import com.athenura.billing_system.InvoiceFolder.dto.InvoiceResponseDTO;


public interface InvoiceService {
    InvoiceResponseDTO createInvoice(InvoiceRequestDTO dto);
    InvoiceResponseDTO getInvoiceById(Long id);

}