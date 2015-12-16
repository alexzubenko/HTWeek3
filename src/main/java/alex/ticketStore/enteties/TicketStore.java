package alex.ticketStore.enteties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 03.12.15.
 */
public class TicketStore {

    private Map<Integer,Ticket> soldTickets;
    private Map<Integer,Ticket> cupeTickets;
    private Map<Integer,Ticket> platscardTickets;
    private Map<Integer,Ticket> svTickets;

    public TicketStore(){};

    public TicketStore(Map<Integer, Ticket> soldTickets, Map<Integer, Ticket> cupeTickets, Map<Integer, Ticket> platscardTickets, Map<Integer, Ticket> svTickets) {
        soldTickets = new HashMap<>();
        cupeTickets = new HashMap<>();
        platscardTickets = new HashMap<>();
        svTickets = new HashMap<>();
    }

    public Map<Integer, Ticket> getSoldTickets() {
        return soldTickets;
    }

    public Map<Integer, Ticket> getCupeTickets() {
        return cupeTickets;
    }

    public Map<Integer, Ticket> getPlatscardTickets() {
        return platscardTickets;
    }

    public Map<Integer, Ticket> getSvTickets() {
        return svTickets;
    }
}
