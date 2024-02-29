package builder;

import lombok.Builder;
import model.AccountDto;
import model.UserDto;

import java.awt.desktop.AboutHandler;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;


public class AccountBuilder {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDate transactionDate;

    public AccountBuilder buildId (long id){
        this.id = id;
        return this;
    }

    public AccountBuilder buildAccountNumber (String accountNumber){
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountBuilder buildAccountHolder (String accountHolder){
        this.accountHolder = accountHolder;
        return this;
    }

    public AccountBuilder buildBalance (double balance){
        this.balance = balance;
        return this;
    }

    public AccountBuilder buildTransactionDate (){
        this.transactionDate = LocalDate.now();
        return this;
    }

    public AccountDto build(){
        return new AccountDto(id,accountNumber, accountHolder,balance,transactionDate);
    }

}
