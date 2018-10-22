package com.company;

import java.util.Scanner;

public class Main {
    //記得要初始化才可以用
    public static Bank mybank = new Bank("CitiBank");
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     boolean quit = false;
        printInstructions();
     while(!quit){

         System.out.println("Enter your choice :");
         int choice = scanner.nextInt();
         switch(choice){
             case 0:
                 printInstructions();
                 break;
             case 1:
                 addBranch();
                 break;
             case 2:
                 addCustomer();
                 break;
             case 3:
                 additionalTransaction();
                 break;
             case 4:
                 printCustomer();
                 break;
             case 5:
                 printTransaction();
                 break;
             case 6:
                 mybank.printBranch();
                 break;
             case 7:
                 quit = true;
                 System.out.println("You have left this App.");
                 break;
         }
     }
    }
    public static void printInstructions(){
        System.out.println("0 : Print out instructions.\n"+
        "1 : Add new Branch.\n"+
        "2 : Add new customer to the branch.\n"+
        "3 : Process additional transaction.\n"+
        "4 : Print out customers of the branch.\n"+
        "5 : Print out transaction records of the customer.\n"+
        "6 : Print out branches.\n"+
        "7 : Leave this App.");
    }
    public static void addBranch(){
        scanner.nextLine();
        System.out.println("Enter the name of new branch :");
        String branchName = scanner.nextLine();
        Branches newbranches = new Branches(branchName);
        mybank.addBranches(newbranches);
    }
    public static void addCustomer(){
        scanner.nextLine();
        System.out.println("Enter the name of the branch added :");
        String branchName = scanner.nextLine();
        System.out.println("Enter the name of the new customer :");
        String customerName = scanner.nextLine();

        System.out.println("Enter the initial amout :");
        double amount = scanner.nextDouble();
        mybank.addcustomertoBranch(branchName,customerName,amount);
    }
    public static void additionalTransaction(){
        scanner.nextLine();
        System.out.println("Enter the name of the branch  :");
        String branchName = scanner.nextLine();
        System.out.println("Enter the name of the customer :");
        String customerName = scanner.nextLine();
        System.out.println("Enter the transaction amout :");
        double amout = scanner.nextDouble();
        mybank.addtransactiontoCustomer(branchName,customerName,amout);
    }
    public static void printCustomer(){
        scanner.nextLine();
        System.out.println("Enter the branch name:");
        String branchName = scanner.nextLine();
        mybank.printCustomer(branchName);
    }
    public static void printTransaction(){
        scanner.nextLine();
        System.out.println("Enter the branch name:");
        String branchName = scanner.nextLine();
        System.out.println("Enter the customer name:");
        String customerName = scanner.nextLine();
        mybank.printTransaction(customerName,branchName);
    }

}
