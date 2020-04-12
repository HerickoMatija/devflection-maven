package com.devflection.controllers;

import com.devflection.bank.models.Mortgage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.MortgageService;

import java.math.BigDecimal;

@RestController()
@RequestMapping("mortgage")
public class MortgageController {

    @GetMapping()
    public Mortgage getMortgage(@RequestParam String name,
                                @RequestParam BigDecimal amount,
                                @RequestParam BigDecimal downPayment,
                                @RequestParam int duration) {
        return MortgageService.getMortgage(name, amount, downPayment, duration);
    }
}