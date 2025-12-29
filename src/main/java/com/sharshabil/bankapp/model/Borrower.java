package com.sharshabil.bankapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nationalId;
    private String phone;
    private String address;

    @OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL)
    private List<Loan> loans;
}
