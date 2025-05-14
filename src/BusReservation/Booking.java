package BusReservation;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Booking {
    private int busNo;
    private String passengerName;
    private Date date;

    Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter passenger name: ");
        passengerName = sc.next();
        System.out.println("Enter bus no: ");
        busNo = sc.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int cap = 0;
        int booked = 0;
        for (Bus b : buses) {
            if (b.getBusNo() == busNo) {
                cap = b.getCapacity();
            }
            booked = 0;
            for (Booking bus : bookings) {
                if (bus.busNo == busNo && bus.date.equals(date)) {
                    booked++;
                }
            }

        }
        return booked < cap ? true : false;
    }
}
