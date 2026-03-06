package com.athenura.billing_system.InvoiceFolder.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceRequestDTO {

    private Long clientId;

    private LocalDate invoiceDate;
    private LocalDate dueDate;

    private List<InvoiceItemRequestDTO> items;
}