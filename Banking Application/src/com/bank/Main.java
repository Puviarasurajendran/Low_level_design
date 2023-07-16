package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Accounts acc = new Accounts("Raja", "321456", 1000, "9087643211");
        System.out.println("***********BANKING APPLICATIOIN**************");
        acc.menu();
        Scanner sc=new Scanner(System.in);
         boolean occur=true;
        do
        {
            System.out.println("Please enter above option");
           int option=sc.nextInt();
            switch(option){
                case 1:
                    acc.checkBalance();
                    break;
                case 2:
                    System.out.print("please enter your deposited amount :");
                    double money=sc.nextDouble();
                    acc.depositMoney(money);
                    break;
                case 3:
                    System.out.print("please enter a amount :");
                    double amt=sc.nextDouble();
                    acc.withDrawMoney(amt);
                    break;
                case 4:
                    acc.viewMiniStatement();
                    break;

                case 5:
                    System.out.println("Thanks for using this Application");
                    System.exit(0);
                default:
                    System.out.println("please enter valid option");
            }

        }while(occur);

    }

}