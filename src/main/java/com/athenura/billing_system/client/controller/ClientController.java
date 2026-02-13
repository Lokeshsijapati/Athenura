package com.athenura.billing_system.client.controller;

import com.athenura.billing_system.client.dto.CreateClientRequest;
import com.athenura.billing_system.client.dto.ClientResponse;
import com.athenura.billing_system.client.service.ClientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ClientResponse createClient(
            @Valid @RequestBody CreateClientRequest request) {
        return clientService.createClient(request);
    }

    @GetMapping("/{id}")
    public ClientResponse getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @GetMapping
    public List<ClientResponse> getAllClients() {
        return clientService.getAllClients();
    }
}
