package BusReservation;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 13));
        buses.add(new Bus(3, true, 15));

        int userOpt = 1;
        Scanner input = new Scanner(System.in);

        for (Bus bus : buses) {
            bus.displayBusInfo();
        }
        while(userOpt==1) {
            System.out.println("Enter 1 to Book and 2 to exit");
            userOpt = input.nextInt();
            if(userOpt == 1) {
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("Your booking is not available");
                }

            }
        }
    }
}
