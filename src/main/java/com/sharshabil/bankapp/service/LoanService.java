package com.sharshabil.bankapp.service;

import com.sharshabil.bankapp.dto.LoanRequest;
import com.sharshabil.bankapp.model.Borrower;
import com.sharshabil.bankapp.model.Loan;
import com.sharshabil.bankapp.repository.BorrowerRepository;
import com.sharshabil.bankapp.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private BorrowerRepository borrowerRepository;

    public Loan createLoan(LoanRequest request) {
        // Create Borrower
        Borrower borrower = new Borrower();
        borrower.setName(request.getBorrowerName());
        borrower.setNationalId(request.getNationalId());
        borrower.setPhone(request.getPhone());
        borrowerRepository.save(borrower);

        // Create Loan
        Loan loan = new Loan();
        loan.setPrincipalAmount(request.getAmount());
        loan.setInterestRate(request.getInterestRate());
        loan.setDurationMonths(request.getMonths());
        loan.setStartDate(LocalDate.now());
        loan.setStatus("ACTIVE");
        loan.setBorrower(borrower);

        // Calculate Repayment
        double interestAmount = request.getAmount() * (request.getInterestRate() / 100);
        loan.setTotalRepayment(request.getAmount() + interestAmount);

        return loanRepository.save(loan);
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoansbyid(long id) {
        return loanRepository.findById(id).orElse(null);
    }
}