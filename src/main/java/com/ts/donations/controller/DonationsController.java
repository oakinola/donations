package com.ts.donations.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DonationsController {

    @GetMapping("/getAllDonations")
    public String getDonations() {
        return String.format("Donations Call Made");
    }
}
