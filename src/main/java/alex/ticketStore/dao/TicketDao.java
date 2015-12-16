package alex.ticketStore.dao;

import alex.ticketStore.enteties.Ticket;

/**
 * Created by alex on 03.12.15.
 */
public interface TicketDao {

    //This should be CRUD operation;

    public Ticket addTicked(Ticket ticket);
    public Ticket deleteTicket(Ticket ticket);
    public Ticket updateTicket(Ticket ticket);
    public Ticket readTicket(Ticket ticket);
}
