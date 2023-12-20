package tickets.logic;

import tickets.data.ticket;

import java.util.List;

public class ticketService {

    // Filtere alle offenen Support-Tickets aus einer Ticketliste.
    public List<ticket> getOpenTickets (List<ticket> tickets) {
        return tickets.stream().filter(ticket::isOpen).toList();
    }

}
