package udemy_exercises.bank;

import java.util.*;

public class Bank {
  Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    ArrayList<Branch> branchList = new ArrayList<Branch>();
    branchList.add(new Branch("Bank of America"));
    branchList.add(new Branch("Chase"));
    branchList.add(new Branch("Unify Credit Union"));
    branchList.add(new Branch("Wells Fargo"));

    //check to see what branches there are
    // for (int i = 0; i < branchList.size(); i++) {
    //   System.out.println(branchList.get(i).branchName);
    // }

    Bank B = new Bank();

    B.menu(branchList);

  }

  void menu(ArrayList<Branch> branchList) {
    int option = 0;
    while (option != 5) {

      System.out.println("\n\nWhat would you like to do?");
      System.out.println(
          "Options: [ \n\t1. new customer,\n\t2. customer transaction,\n\t3. new branch,\n\t4. see branch information,\n\t5. quit\n\t ]\nEnter number:");
      option = s.nextInt();
      switch (option) {
        case 1:
          addCustomer(branchList);
          break;
        case 2:
          newTransaction(branchList);
          break;
        case 3:
          newBranch(branchList);
          break;
        case 4:
          branchInformation(branchList);
          break;
        case 5:
          System.out.println("Ending cmd... Thank you");
          break;
        default:
          System.out.println("incorrect selection: Error... Ending cmd.");
          break;
      }
    }

  }

  void addCustomer(ArrayList<Branch> branchList) {
    System.out.print("Adding new customer\nCustomer Name: ");
    String customerName = s.next();
    System.out.print("Initial Transaction: ");
    int customerTransaction = s.nextInt();
    while (customerTransaction <= 0) {
      if (customerTransaction > 0) {
        break;
      } else {
        System.out.println("Initial transaction is invalid. Please input a positive number.");
        System.out.print("Initial Transaction:");

        customerTransaction = s.nextInt();
      }
    }

    System.out.println("\nNew Customer information:");
    System.out.print("Customer Name:     ");
    System.out.println(customerName);
    System.out.print("Current Balance:   $");
    System.out.println(customerTransaction + "\n\n");

    System.out.println("Which Branch would you like to be placed in?");
    for (int i = 0; i < branchList.size(); i++) {
      int counter = i;
      System.out.println("\t" + (counter + 1) + ". " + branchList.get(i).branchName);
    }
    System.out.println("Enter Number: ");
    int branchSelect = s.nextInt();
    System.out.println("Routing to Menu...\n");

  }

  void newTransaction(ArrayList<Branch> branchList) {
    System.out.println("Add transaction to customer");
  }

  void newBranch(ArrayList<Branch> branchList) {

    System.out.println("Adding a new branch\n\nCurrent branches:");
    for (int i = 0; i < branchList.size(); i++) {
      int counter = i;
      System.out.println("\t" + (counter + 1) + ". " + branchList.get(i).branchName);
    }
    System.out.print("New branch name: ");
    String bName = s.next();
    while (bName != "") {

    }

  }

  void branchInformation(ArrayList<Branch> branchList) {
    System.out.println("Branch information");
    System.out.println("Current branches:");
    for (int i = 0; i < branchList.size(); i++) {
      int counter = i;
      System.out.println("\t" + (counter + 1) + ". " + branchList.get(i).branchName);
    }
  }

}

/*
**Banking w/ Java Classes**
 - **Bank class**
    - List of Branches
    - Add a new branch
    - Add a customer to that branch with initial transaction
    - Add a transaction for an existing customer for that branch
    - Show a list of customers for a particular branch and optionally a list of their transactions
 - Demonstration autoboxing and unboxing in your code
 - Think about where you are adding the code to perform certain actions
 - **Branch class**
   - List of Customers
   - List of Transactions
 - **Customer Class**:
   - Customer Name
 - **Branch Class**:
   - addCustomer and initial transaction amount.
   - Also needs to add additional transactions for that customer/branch
 - **Bank:**
   
*/