package com.athenura.billing_system.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dashboardControler {
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}
