package com.gov.main;

import com.gov.tax.services.TaxService;
import com.gov.passport.services.PassportService;

public class Main {
    public main(String[] args) {
        System.out.println("=== Uganda Government Secure Services System ===");

        TaxService taxService = new TaxService();
        taxService.processTaxCollection();

        PassportService passportService = new PassportService();
        passportService.processPassport();

        System.out.println("=== All authorized modules executed successfully ===");
    }
}
