package com.athenura.billing_system.client.controller;

import com.athenura.billing_system.client.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/clients")
@RequiredArgsConstructor
public class AdminClientController {

    private final ClientService clientService;

    @DeleteMapping("/{id}")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "Client deleted successfully";
    }
}