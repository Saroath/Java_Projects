package BusReservation;
import java.util.*;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity; //ella data kkum get set method ready panni vaikkanum

    Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getCapacity() {  //accessor method
        return capacity;
    }
    public void setCapacity(int capacity) {  //mutator
        this.capacity = capacity;
    }
    public int getBusNo() {
        return busNo;
    }
    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }
    public boolean isAc() {
        return ac;
    }
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public void displayBusInfo() {
        System.out.println("BusNo: " + busNo + ", ac: " + ac + ", Total capacity: " + capacity);
    }


}
