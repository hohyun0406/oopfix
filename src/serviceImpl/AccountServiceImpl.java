package serviceImpl;

import model.Account;
import service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService{
    private static AccountService instance = new AccountServiceImpl();
    public static AccountService getInstance() {return instance;}

    @Override
    public String createAccount(Account account) {
        return null;
    }

    @Override
    public String deposit(Account account) {
        return null;
    }

    @Override
    public String withdraw(Account account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String deleteAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }
}
