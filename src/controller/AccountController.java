package controller;

import builder.AccountBuilder;
import model.AccountDto;
import model.UserDto;
import service.AccountService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AccountController{
    public HashMap<String, UserDto> getAccount;
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }


    public String createAccount(Scanner sc) {
        return accountService.createAccount(new AccountBuilder()
                .buildId(sc.nextLong())
                .buildAccountNumber(sc.next())
                .buildAccountHolder(sc.next())
                .buildBalance(sc.nextDouble())
                .buildTransactionDate()
                .build());
    }

    public String deposit(Scanner sc) {
        return accountService.createAccount(new AccountBuilder()
                .buildId(sc.nextLong())
                .buildAccountNumber(sc.next())
                .buildAccountHolder(sc.next())
                .buildBalance(sc.nextDouble())
                .buildTransactionDate()
                .build());
    }

    public String withdraw(Scanner sc) {
        return accountService.createAccount(new AccountBuilder()
                .buildId(sc.nextLong())
                .buildAccountNumber(sc.next())
                .buildAccountHolder(sc.next())
                .buildBalance(sc.nextDouble())
                .buildTransactionDate()
                .build());
    }

    public String getBalance() {
        return null;
    }

    public String deleteAccount(Scanner sc) {
        return accountService.createAccount(new AccountBuilder()
                .buildId(sc.nextLong())
                .buildAccountNumber(sc.next())
                .buildAccountHolder(sc.next())
                .buildBalance(sc.nextDouble())
                .buildTransactionDate()
                .build());
    }
}
