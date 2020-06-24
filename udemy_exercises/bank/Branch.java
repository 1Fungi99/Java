package udemy_exercises.bank;

import java.util.*;

public class Branch {
    public String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    ArrayList<Customer> customerList = new ArrayList<Customer>();

    public void addCustomer(Customer person) {
        customerList.add(person);

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i).customerName);
        }
    }
}

/*
**Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
*/
