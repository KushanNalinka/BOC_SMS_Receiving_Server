package com.example.smsreceiving.controller;

import com.example.smsreceiving.service.SmsReceivingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sms")
public class SmsReceivingController {

    private final SmsReceivingService service;

    public SmsReceivingController(SmsReceivingService service) {
        this.service = service;
    }

    @GetMapping("/process")
    public String processRecords() {
        try {
            service.processRecords();
            return "Records sent to Gateway Server for processing.";
        } catch (Exception e) {
            // Improved exception handling and detailed response
            return "Error while processing records: " + e.getMessage();
        }
    }
}

