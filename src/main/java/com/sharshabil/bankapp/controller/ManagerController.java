package com.sharshabil.bankapp.controller;

import com.sharshabil.bankapp.dto.LoanRequest;
import com.sharshabil.bankapp.model.Loan;
import com.sharshabil.bankapp.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/create-loan")
    public ResponseEntity<Loan> createLoan(@RequestBody LoanRequest request) {
        return ResponseEntity.ok(loanService.createLoan(request));
    }

    @GetMapping("/loans")
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/loan")
    public String getLoan() {
        return loanService.getLoansbyid(1) + "";
    }

    @GetMapping("/shit")
    public String shit() {
        return "shit.html";
    }
}