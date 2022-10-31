package booking;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Desk desk =  new Desk(1,"Desk-100");
        Desk desk2 =  new Desk(2,"Desk-100");
        System.out.println(desk2);
        System.out.println(desk);

        RecurrentBooking recurrentBooking =  new RecurrentBooking();

//        recurrentBooking.makeRecurrentBooking(
//                LocalDate.of(2022, 5, 1),
//                LocalDate.of(2022, 5, 31),
//                1);

        System.out.println(recurrentBooking.makeRecurrentBooking(
                LocalDate.of(2022, 5, 1),
                LocalDate.of(2022, 5, 31),
                1));

    }



}
