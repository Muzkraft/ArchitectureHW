package org.example.HW4;

import java.util.Collection;
import java.util.Date;

/**
 * Mobile App
 */
public class MobileApp {
    private final Customer customer;

    private final TicketProvider ticketProvider;

    private final CustomerProvider customerProvider;

    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider) {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        customer = customerProvider.getCustomer("<login>", "<password>");
    }

    //    Предусловие
    public void auth(Customer customer) {
        if (customer == customerProvider.getCustomer("login", "password")) {
            customerProvider.profile(customer);
        }
        else {
            customerProvider.registration();
        }
    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public void searchTicket(Date date){
        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    public boolean buyTicket(String cardNumber){
        return ticketProvider.buyTicket(customer.getId(), cardNumber);
    }
}
