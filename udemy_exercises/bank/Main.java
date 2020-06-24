package udemy_exercises.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("J.P. Morgan Chase");

        bank.addBranch("Frisco");
        bank.addCustomer("Frisco", "John Doe", 500.59);
        bank.addCustomer("Frisco", "Ben Dover", 420.69);

        bank.addBranch("Prosper");
        bank.addCustomer("Prosper", "Sofa King", 420.00);

        bank.addCustomerTransaction("Frisco", "John Doe", 50.00);
        bank.addCustomerTransaction("Frisco", "John Doe", 15.00);
        bank.addCustomerTransaction("Frisco", "Ben Dover", 50.00);
        bank.addCustomerTransaction("Prosper", "Sofa King", 150.00);

        bank.listCustomers("Frisco", true);
        bank.listCustomers("Prosper", true);

    }
}