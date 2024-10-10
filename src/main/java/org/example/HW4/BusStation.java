package org.example.HW4;

/**
 * Bus station
 */
public class BusStation {
    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    public boolean checkTicket(String qrCode){
        return ticketProvider.checkTicket(qrCode);
    }
}
