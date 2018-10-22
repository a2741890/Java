package com.company;

import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class Bank {
    private  ArrayList<Branches> branches = new ArrayList<>();
    private String nameofBank;

    public  ArrayList<Branches> getBranches() {
        return branches;
    }

    public String getNameofBank() {
        return nameofBank;
    }

    public Bank(String nameofBank) {
        this.branches = branches;
        this.nameofBank = nameofBank;
    }
    public void addBranches(Branches newbranches){


        this.branches.add(newbranches);
        System.out.println("You have added a new branch :" + newbranches.getBranchName());
    }
    public void addcustomertoBranch(String branchesName,String customerName, double initialamount) {
        Branches branchesexisiting = findBranch(branchesName);

        if (branchesexisiting == null) {
            System.out.println("Can't find this branch.");

        } else {
            //弄已經做好的方法就不用在一次了

                    //加在該東西底下,addCustomer內已經有this
                branchesexisiting.addCustomer(customerName,initialamount);

        }
    }
    public void addtransactiontoCustomer(String branchName,String customerName, double amount){
        Branches branchesexisiting = findBranch(branchName);
        if(branchesexisiting == null) {
            System.out.println("Can't find this branch.");
        }
        else {
            Customers customersexisting = branchesexisiting.findCustomer(customerName);
            if (customersexisting == null) {
                System.out.println("Can't find this customer.");
            }
            else{
                branchesexisiting.additonalTransaction(customerName,amount);
            }
        }
    }
    public void printBranch(){
        for(int i=0; i<this.branches.size(); i++) {
            System.out.println((i+1) + "." +this.branches.get(i).getBranchName());
        }
        }
    public void printCustomer(String branchName){
        Branches branchesexisting = findBranch(branchName);
        if(branchesexisting == null){
            System.out.println("Can't find this branch.");
        }
        branchesexisting.printCustomer();
    }
    public void printTransaction(String customerName, String branchName) {

        Branches branchesexisting = findBranch(branchName);
        if (branchesexisting == null) {
            System.out.println("Can't find this branch.");
        } else {
            if (branchesexisting.findCustomer(customerName) == null) {
                System.out.println("Can't find this customer.");
            } else {
                branchesexisting.findCustomer(customerName).printTransaction();
            }
        }
    }
    public Branches findBranch(String branchName){

        for(int i=0; i<branches.size(); i++){
            if(branches.get(i).getBranchName().equals(branchName)){
                return branches.get(i);
            }

        }

        return null;

    }
}
