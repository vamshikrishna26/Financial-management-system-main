package com.Bankmanagementapp.AndhraState.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.Bankmanagementapp.AndhraState.Entity.Transaction;
import com.Bankmanagementapp.AndhraState.Service.TransactionService;
import com.Bankmanagementapp.AndhraState.Types.TransactionType;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;
//http://localhost:9976/api/transactions/create
    @PostMapping("/create")
    @Transactional
    public Transaction createTransaction(@RequestParam Long accountId, @RequestParam TransactionType transactionType, @RequestParam double amount) {
        return transactionService.createTransaction(accountId, transactionType, amount);
    }

    @GetMapping("/{transactionId}")
    public Transaction getTransaction(@PathVariable Long transactionId) {
        return transactionService.getTransaction(transactionId);
    }

    @DeleteMapping("/{transactionId}")
    @Transactional
    public void deleteTransaction(@PathVariable Long transactionId) {
        transactionService.deleteTransaction(transactionId);
    }
    //http://localhost:9976/api/transactions/users
    @GetMapping("users")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
