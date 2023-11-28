package practice16.data;

public class Seat {

    private boolean seatIsTaken = true;

    private String decleration;

    public void setSeatIsTaken(boolean seatIsTaken) {
        this.seatIsTaken = seatIsTaken;
    }

    public boolean getSeatIsTaken() {
        return seatIsTaken;
    }

    public Seat(boolean seatIsTaken) {
        this.seatIsTaken = seatIsTaken;
    }

    public void setDecleration() {
        if (getSeatIsTaken()) {
            decleration = "belegt";
        } else {
            decleration = "frei";
        }
    }


}
