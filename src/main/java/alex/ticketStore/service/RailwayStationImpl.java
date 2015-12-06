package alex.ticketStore.service;

import alex.ticketStore.enteties.Ticket;
import alex.ticketStore.enteties.TicketStore;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 03.12.15.
 */
public class RailwayStationImpl implements RailwayStation {
    TicketStore ticketStore = new TicketStore();


    @Override
    public void showAllAvailableTicketsInfo() {
        System.out.println("CupeTickets");
        ticketStore.getCupeTickets();
        System.out.println("PlatscardTickets");
        ticketStore.getPlatscardTickets();
        System.out.println("SVTickets");
        ticketStore.getSvTickets();

    }

    @Override
    public Ticket checkTicketByNumber(Ticket ticket) {

        if (ticket.getTicketType().equals("Cupe")) {
            return ticketStore.getCupeTickets().get(ticket.getId());
        } else if (ticket.getTicketType().equals("Platscard")) {
            return ticketStore.getPlatscardTickets().get(ticket.getId());
        } else
            return ticketStore.getSvTickets().get(ticket.getId());

    }

    @Override
    public Ticket buyCupeTicket(Ticket ticket) {

        ticketStore.getCupeTickets().remove(ticket.getId());

        return ticketStore.getSoldTickets().put(ticket.getId(), ticket);

    }

    @Override
    public Ticket buyPlatscardTicket(Ticket ticket) {

        ticketStore.getPlatscardTickets().remove(ticket.getId());
        return ticketStore.getSoldTickets().put(ticket.getId(), ticket);

    }

    @Override
    public Ticket buySvTicket(Ticket ticket) {

        ticketStore.getSvTickets().remove(ticket.getId());
        return ticketStore.getSoldTickets().put(ticket.getId(), ticket);

    }


    @Override
    public Ticket returnTicket(Ticket ticket) {

        ticketStore.getSoldTickets().remove(ticket.getId());
        if (ticket.getTicketType().equals("Cupe")) {
            return ticketStore.getCupeTickets().put(ticket.getId(), ticket);
        } else if (ticket.getTicketType().equals("Platscard")) {
            return ticketStore.getPlatscardTickets().put(ticket.getId(), ticket);
        } else
            return ticketStore.getSvTickets().put(ticket.getId(), ticket);

    }

    @Override
    public int checkAllMoney() {
        int money = 0;

        for (Ticket tk : ticketStore.getSoldTickets().values()) {
            money = money + tk.getTicketPrice();

        }

        return money;


    }
}
