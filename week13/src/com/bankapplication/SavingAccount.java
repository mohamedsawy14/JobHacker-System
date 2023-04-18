package com.bankapplication;

import java.util.Scanner;

public class SavingAccount extends Account {

    Scanner sc = new Scanner(System.in);
    int x;
    public void createaccount(){

        System.out.println("Enter the Name of Account :");
        acc_name= sc.next();
        System.out.println("Enter the ID Account :");
        acc_id=sc.nextInt();
        System.out.println("Enter the Balance");
        blance= sc.nextInt();
    }

        public  void displayaccount(){

            System.out.println("Account Name is "+acc_name);
            System.out.println("Account_id is "+acc_id);
            System.out.println("Account Balance is "+blance);

        }


    public void deposit(){

        System.out.println("Enter the Amount Money");
        x=sc.nextInt();
        blance= blance+x;
    }
    public void withdraw(){
        System.out.println("Enter the Amount Money to withdraw");
        x= sc.nextInt();
        if (blance>=x){
            blance=blance-x;
            System.out.println("Balance After withdrawl"+blance);
        }else {
            System.out.println("Your Balance is less than your balance"+x);
        }

    }

}
