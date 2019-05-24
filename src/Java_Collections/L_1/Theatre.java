package Java_Collections.L_1;

import java.util.ArrayList;
import java.util.*;

public class Theatre {
private final String theatreName;
private  List<Seat> seats;
static  final Comparator<Seat> PRICE_ORDER =  new Comparator<Seat>() {
    @Override
    public int compare(Seat seat1, Seat seat2) {

        if(seat1.getPrice() < seat2.getPrice()){
            return -1;
        }else if (seat1.getPrice() > seat2.getPrice()){
            return 1;
        }else {
            return 0;
        }
    }

};


    public Theatre(String theatreName,int numRows,int seatsPerRow) {
        this.theatreName = theatreName;
         seats = new ArrayList<>();
         int lastRow = 'A' + (numRows - 1);
         for(char row='A';row <= lastRow;row++){
           for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
             Seat seat = new Seat(row + String.format("%02d",seatNum),0);
             double price = 12.00;

             if((row<'D') && (seatNum >=4 && seatNum <=9)){
                 price = 14.00;
             }else if ((row > 'F') || (seatNum < 4 || seatNum > 9)){
                  price = 7.00;
             }

             seats.add(seat);
           }
         }
    }


    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = new Seat(seatNumber,0);
        int foundSeat =  Collections.binarySearch(seats,requestSeat,null);
        if(foundSeat >=0){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        /*
        for( Seat seat : seats ){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestSeat = seat;
                break;
            }

        }
        if(requestSeat == null){
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
      return requestSeat.reserve();
      */
    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    public class Seat implements  Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private  boolean reserved = false;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            }else{
                return false;
            }
        }


        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public double getPrice() {
            return price;
        }
    }
}
