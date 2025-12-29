package com.sharshabil.bankapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private Double principalAmount;
    private Double interestRate;
    private Integer durationMonths;
    private Double totalRepayment;
    private LocalDate startDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "borrower_id")
    @JsonIgnore
    private Borrower borrower;
}