package practice16;

import practice16.data.Seat;

public class Main {
    public static void main(String[] args) {


        Seat[][] seatingPlan = new Seat[3][3];

        Seat seat1 = new Seat(true);
        Seat seat2 = new Seat(true);
        Seat seat3 = new Seat(false);
        Seat seat4 = new Seat(true);
        Seat seat5 = new Seat(true);
        Seat seat6 = new Seat(false);
        Seat seat7 = new Seat(true);
        Seat seat8 = new Seat(true);
        Seat seat9 = new Seat(false);


        seatingPlan[0][0] = seat1;
        seatingPlan[0][1] = seat2;
        seatingPlan[0][2] = seat3;
        seatingPlan[1][0] = seat4;
        seatingPlan[1][1] = seat5;
        seatingPlan[1][2] = seat6;
        seatingPlan[2][0] = seat7;
        seatingPlan[2][1] = seat8;
        seatingPlan[2][2] = seat9;

        for (Seat[] seatArray : seatingPlan) {
            System.out.print(seatArray);
            System.out.println();
        }
    }
}