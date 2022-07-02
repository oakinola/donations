package com.ts.donations.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DonationsControllerTest {

    @Test
    void givenController_whenGetDonations_statusOKReturned() {

        DonationsController donationsController = new DonationsController();

        String response = donationsController.getDonations();
        assertEquals("Donations Call Made", response);
    }
}
