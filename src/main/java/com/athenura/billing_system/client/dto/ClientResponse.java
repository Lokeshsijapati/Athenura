package com.athenura.billing_system.client.dto;

import java.time.LocalDateTime;
import java.util.Set;

public record ClientResponse(
        Long id,
        String name,
        String email,
        String phone,
        String gstNumber,
        String address,
        LocalDateTime createdAt
) {}