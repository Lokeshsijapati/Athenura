package com.athenura.billing_system.InvoiceFolder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.athenura.billing_system.InvoiceFolder.entity.InvoiceItem;


public interface InvoiceItemRepository extends JpaRepository<InvoiceItem,Long> {

}
