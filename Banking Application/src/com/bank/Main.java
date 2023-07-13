package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Accounts acc = new Accounts("Raja", "321456", 1000, "9087643211");
        System.out.println("***********BANKING APPLICATIOIN**************");
        acc.menu();
        Scanner sc=new Scanner(System.in);
        int option;
        do
        {
            System.out.println("Please enter above option");
            option=sc.nextInt();
            switch(option){
                case 1:
                    acc.checkBalance();
                    break;
                case 2:
                    System.out.print("please enter amount :");
                    double money=sc.nextDouble();
                    acc.depositMoney(money);
                    break;
                case 3:
                    System.out.print("please enter amount :");
                    double amt=sc.nextDouble();
                    acc.withDrawMoney(amt);
                    break;
                case 4:
                    System.out.println("=====================");
                    break;
                default:
                    System.out.println("please enter valid option");
            }

        }while(option!=4);

    }

}