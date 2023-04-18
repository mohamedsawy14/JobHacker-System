package com.bankapplication;

import com.bankapplication.*;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        int n;
        int ch;
        Scanner sc = new Scanner(System.in);
        Account account =new Account();
        System.out.println("Enter the No. of Customer to Create Account ");
        n=sc.nextInt();
        SavingAccount SV[] = new SavingAccount[n];
        for (int i = 0; i < SV.length; i++) {
                SV[i]= new SavingAccount();
                SV[i].createaccount();

        }

        do {

            System.out.println("Welcome to Banking System Application");
            System.out.println("1.Display All Accounts");
            System.out.println("2.Deposit the Money");
            System.out.println("3.Withdraw the Money");
            System.out.println("4.Exit");
            System.out.println("Enter the Choice:");
            ch= sc.nextInt();

            switch (ch){
                case 1:
                    for (int i = 0; i < SV.length ; i++) {
                        SV[i].displayaccount();
                        break;
                    }
                case 2:
                    System.out.println("Enter Account No.");
                    account.acc_id=sc.nextInt();
                    for (int i = 0; i < SV.length ; i++) {
                        SV[i].deposit();
                    break;
                    }
                case 3:
                    System.out.println("Enter The Account No.");
                    account.acc_id= sc.nextInt();
                    for (int i = 0; i < SV.length ; i++) {
                        SV[i].withdraw();
                        break;
                    }
                case 4:
                    System.out.println("Thanks for Using Banking System Applicaion");
                        break;
            }





        }while (ch !=4);


    }

}