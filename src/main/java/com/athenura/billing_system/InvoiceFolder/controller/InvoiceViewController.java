package com.athenura.billing_system.InvoiceFolder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.athenura.billing_system.InvoiceFolder.dto.InvoiceResponseDTO;
import com.athenura.billing_system.InvoiceFolder.services.InvoiceService;


import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/manager/invoices")
@RequiredArgsConstructor
public class InvoiceViewController {
    private final InvoiceService invoiceService;

//     @GetMapping("/{id}")
//     public String viewInvoice(@PathVariable Long id, Model model) {

//         InvoiceResponseDTO invoice = invoiceService.getInvoiceById(id);

//         model.addAttribute("invoice", invoice);

//         return "invoice";
// }
}