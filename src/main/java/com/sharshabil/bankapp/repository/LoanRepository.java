package com.sharshabil.bankapp.repository;

import com.sharshabil.bankapp.model.Loan;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {}