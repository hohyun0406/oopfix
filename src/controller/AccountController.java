package controller;

import model.Account;
import model.User;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.HashMap;
import java.util.Scanner;

public class AccountController{
    public HashMap<String, User> getAccount;
    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }


    public String createAccount(Scanner sc) {
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .build());
    }

    public String deposit(Scanner sc) {
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .build());
    }

    public String withdraw(Scanner sc) {
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .build());
    }

    public String getBalance() {
        return null;
    }

    public String deleteAccount(Scanner sc) {
        return accountService.createAccount(Account.builder()
                .id(sc.nextLong())
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(sc.nextDouble())
                .build());
    }
}
