package org.example.HW4;

import java.util.Collection;

public class CustomerProvider {
    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password) {
        return new Customer();
    }

    public Customer registration() {
        Customer customer = new Customer();
        Collection<Customer> customers = database.getCustomers();
        customers.add(customer);
        System.out.println("Registration complete");
        return customer;
    }

    public void profile(Customer customer) {
        System.out.println("Entered in customer profile");
    }
}
