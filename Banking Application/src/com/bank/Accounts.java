package com.bank;

import java.util.Scanner;

public class Accounts {
    private String name;
    private String accno;
    private double balance;
    private String phnNum;


    public Accounts(String name,String accno,double balance,String phnNum){
        this.name=name;
        this.accno=accno;
        this.balance=balance;
        this.phnNum=phnNum;
    }
    public void depositMoney(double money){
        this.balance+=money;
        System.out.println("Money deposited Successfully...");
    }
    public void withDrawMoney(double amt){
        if(this.balance>=amt){
            this.balance-=amt;
            System.out.println("Withdrawal money successfully take your cash"+ amt);

        }else
            System.out.println("Your account does not have this amount");
    }
    public void checkBalance(){
        System.out.println("Available balance is :"+balance);
    }
    public void menu(){
        System.out.println("Welcome "+name);
        System.out.println();
        System.out.println("HERE IS your menu ");
        System.out.println("1. CheckaccBalance"+"\n"+"2 .DepositMoney"+"\n"+"3. Withdraw money"
                +"\n"+"4. Exit");
        System.out.println("===========================");

    }

    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }
}
