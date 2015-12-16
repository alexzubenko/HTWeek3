package alex.ticketStore.enteties;

import java.sql.Time;
import java.util.Date;

/**
 * Created by alex on 03.12.15.
 */
public class Ticket {

    private int id;
    private String from;
    private String to;
    private Date departureDate;
    private Time departureTime;
    private Date arrivalDate;
    private Time arrivalTime;
    private int wagonNumber;
    private int ticketPrice;
    private String ticketType;

    public Ticket(){};

    public Ticket(int id, String from, String to, Date departureDate, Time departureTime, Date arrivalDate,
                  Time arrivalTime, int wagonNumber, int ticketPrice, String ticketType) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.wagonNumber = wagonNumber;
        this.ticketPrice = ticketPrice;
        this.ticketType = ticketType;
    }


    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getTicketType() {
        return ticketType;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ticket{");
        sb.append("id=").append(id);
        sb.append(", from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", departureDate=").append(departureDate);
        sb.append(", departureTime=").append(departureTime);
        sb.append(", arrivalDate=").append(arrivalDate);
        sb.append(", arrivalTime=").append(arrivalTime);
        sb.append(", wagonNumber=").append(wagonNumber);
        sb.append(", ticketPrice=").append(ticketPrice);
        sb.append(", ticketType='").append(ticketType).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (id != ticket.id) return false;
        return ticketType.equals(ticket.ticketType);

    }

    @Override
    public int hashCode() {
        int result = id;
        return result;
    }
}
