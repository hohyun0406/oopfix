package view;

import controller.AccountController;
import model.AccountDto;

import java.util.List;
import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();

        while(true){
            System.out.println("Select Menu : \n" +
                    "0 - Exit\n" +
                    "1 - Create\n" +
                    "2 - Deposit\n" +
                    "3 - Withdraw\n" +
                    "4 - Balance\n" +
                    "5 - Delete\n" +
                    "6 - AccountList\n");
            switch (sc.next()){
                case "0" :
                    System.out.println("Thank you.");return;
                case "1" :
                    System.out.println("Create new account.");
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2" :
                    System.out.println("How much will you deposit?");
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3" :
                    System.out.println("How much will you withdraw?");
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4" :
                    System.out.println("Current balance");
                    System.out.println(accountController.getBalance());
                    break;
                case "5" :
                    System.out.println("Delete your account? Y/N");
                    System.out.println(accountController.deleteAccount(sc));
                    break;
                case "6" :
                    System.out.println("Account List");
                    accountController.getAccount.forEach((i)->{
                        System.out.println(i);
                    });
                    System.out.println();
                    break;
            }
        }
    }



}
