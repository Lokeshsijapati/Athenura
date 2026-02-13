package com.athenura.billing_system.client.dto;

import java.time.LocalDateTime;

public record ClientResponse(
        Long id,
        String name,
        String email,
        String phone,
        String gstNumber,
        String address,
        LocalDateTime createdAt
) {}