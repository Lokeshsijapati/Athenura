package com.athenura.billing_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @GetMapping("dashboard")
    public String managerAccess(){
        return "manager dashboard access";
    }
}
