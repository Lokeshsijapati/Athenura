package com.athenura.billing_system.InvoiceFolder.controller;

import com.athenura.billing_system.InvoiceFolder.dto.InvoiceResponseDTO;
import com.athenura.billing_system.InvoiceFolder.serviceImpl.InvoicePdfService;
import com.athenura.billing_system.InvoiceFolder.services.InvoiceService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("manager/invoice/pdf")
@RequiredArgsConstructor
public class InvoicePdfController {

    private final InvoiceService invoiceService;
    private final InvoicePdfService invoicePdfService;

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> downloadInvoicePdf(@PathVariable Long id) {
        // Invoice DTO fetch
        InvoiceResponseDTO invoiceDTO = invoiceService.getInvoiceById(id);


        // Generate PDF bytes
        byte[] pdfBytes = invoicePdfService.generateInvoicePdf(invoiceDTO);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=invoice_" + invoiceDTO.getInvoiceNumber() + ".pdf")
                .contentType(MediaType.APPLICATION_PDF).body(pdfBytes);
    }

}