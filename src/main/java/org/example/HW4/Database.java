package org.example.HW4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * databse

 */
public class Database {
    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database(){
        customers.add(new Customer());
        customers.add(new Customer());
        customers.add(new Customer());
        customers.add(new Customer());
        tickets.add(new Ticket(new Date(), "123"));
        tickets.add(new Ticket(new Date(), "1233"));
        tickets.add(new Ticket(new Date(), "1234"));
        tickets.add(new Ticket(new Date(), "1235"));
        tickets.add(new Ticket(new Date(), "1236"));

    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    /**
     * get ticket price
     */
    public double getTicketAmount(){ return 45;}

    /**
     * get ticket order id
     * @param clientId
     * @return
     */
    public int createTicketOrder(int clientId) {
        return ++counter;
    }
}
