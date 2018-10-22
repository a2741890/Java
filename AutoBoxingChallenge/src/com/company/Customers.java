package com.company;

import java.util.ArrayList;

public class Customers {
    private String name;
    private double balance;
    private  ArrayList<Transaction> transactions= new ArrayList<>();

    public Customers(String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = transactions;
    }

    public String getName() {
        return this.name;
    }

    public  ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    //覺得有需要加入新增的東西就寫一個add方法在該class內
    public void addTransaction(double amount){
        Transaction temptTransaction = new Transaction(amount);
        this.transactions.add(temptTransaction);
        balance +=amount;
        System.out.println("Balance : $" + balance);
    }
    public void printTransaction(){
        for (int i=0; i<this.transactions.size(); i++){
            System.out.println((i+1) + "." + this.transactions.get(i).getAmountofTransaction()
            + "\nBalance: $" + balance);

        }
    }
}
