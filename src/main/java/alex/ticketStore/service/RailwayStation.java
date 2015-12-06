package alex.ticketStore.service;

import alex.ticketStore.enteties.Ticket;
import alex.ticketStore.enteties.TicketStore;

import java.util.Map;

/**
 * Created by alex on 03.12.15.
 */
public interface RailwayStation {

    public void showAllAvailableTicketsInfo();
    public Ticket checkTicketByNumber(Ticket ticket);
    public Ticket buyCupeTicket (Ticket ticket);
    public Ticket buyPlatscardTicket (Ticket ticket);
    public Ticket buySvTicket (Ticket ticket);
    public Ticket returnTicket(Ticket ticket);
    public int checkAllMoney();


}
