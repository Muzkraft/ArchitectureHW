package org.example.HW4;

import java.util.Collection;
import java.util.Date;

/**
    разработать контракты и компоненты системы "Поуцруа онлайн билетов на автобус в час пик"

 1. Предусловие
 2. постусловие
 3. Инвариант
 4. Определить абстрактные и конкретные классы
 5. Определить интерфейсы
 6. Реализовать наследование
 7. Выявить компоненты
 8. Разработать диаграмму компонентов используя нотацию UML 2.0. Общую, без деталей
 */
public class Program {
    public static void main(String[] args) {
        CoreApp coreApp = new CoreApp();
        MobileApp mobileApp = new MobileApp(coreApp.getTicketProvider(), coreApp.getCustomerProvider());
        BusStation busStation = new BusStation(coreApp.getTicketProvider());

        Customer customer = new Customer();
        mobileApp.auth(customer);

        if (mobileApp.buyTicket("123456123456")) {
            System.out.println("Client successfully bought ticket");
            mobileApp.searchTicket(new Date());
            Collection<Ticket> tickets = mobileApp.getTickets();
//            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrCode())){
            if (busStation.checkTicket("123")){
                System.out.println("Client successfully sat on bus");
            }
            else {
                System.out.println("Ticket expired");
            }
        }

    }
}
