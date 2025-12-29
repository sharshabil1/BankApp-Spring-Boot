package com.sharshabil.bankapp.dto;

import lombok.Data;

@Data
public class LoanRequest {
    private String borrowerName;
    private String nationalId;
    private String phone;
    private Double amount;
    private Double interestRate;
    private Integer months;
}
