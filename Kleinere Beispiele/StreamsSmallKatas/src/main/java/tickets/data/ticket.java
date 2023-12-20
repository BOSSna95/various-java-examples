package tickets.data;

public class ticket {
    int TicketID;
    boolean open;


    public int getTicketID() {
        return TicketID;
    }
    public void setTicketID(int ticketID) {
        TicketID = ticketID;
    }
    public boolean isOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }
}
