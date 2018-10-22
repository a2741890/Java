package com.company;

import java.util.ArrayList;

public class Branches {
    private  ArrayList<Customers> customers = new ArrayList<>();
    private String BranchName;

    public Branches(String branchName) {
        this.BranchName = branchName;
        //要初始化ArrayLisit,表示直指這個customer
        customers = customers;
    }

    public  ArrayList<Customers> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void addCustomer(String name, double initialTransaction) {
        Customers nameExisting = findCustomer(name);
        if (nameExisting == null) {
            Customers temptcustomer = new Customers(name);
            temptcustomer.addTransaction(initialTransaction);
            this.customers.add(temptcustomer);
            System.out.println("You have added a new customer.");
        } else {
            System.out.println("The name of customer has been used.");
        }
    }
    public void additonalTransaction(String name, double amout){
        Customers customerExisting = findCustomer(name);
        if(customerExisting == null){
            System.out.println("This customer doesn't exist.");
        }
        else {
            //加入該位customer的帳戶交易計入內

                    customerExisting.addTransaction(amout);
            }
            System.out.println("You have finish a transaction :" + amout);
        }

    public void printCustomer(){
        for(int i=0; i<this.customers.size(); i++){
            System.out.println((i+1) +"."+ this.customers.get(i).getName());
        }
    }
public Customers findCustomer(String name){
    for(int i=0; i<customers.size(); i++) {
        if(customers.get(i).getName().equals(name)){
            //取得該個customer
            return customers.get(i);
        }
    }
    return null;
}

}
