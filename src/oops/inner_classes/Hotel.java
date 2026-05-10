package oops.inner_classes;

public class Hotel {

    private String name;

    private int availableRooms;


    public Hotel(String name, int availableRooms) {
        this.name = name;
        this.availableRooms = availableRooms;
    }

    void reserveRoom(String customerName, int reqRooms){

        System.out.println("Processing reservation for "+customerName);

        //local inner class
        class ReservationValidator{

            void validator(){
                if(reqRooms <= 0){
                    System.out.println("Invalid request..");
                }
                else if (reqRooms > availableRooms){
                    System.out.println("Rooms not available");
                }
                else{
                    availableRooms -= reqRooms;

                    System.out.println("Reservation successful");
                    System.out.println("Hotel: " + name);
                    System.out.println("Rooms booked: " +reqRooms);


                }
            }

        }

        ReservationValidator rv=new ReservationValidator();
        rv.validator();

    }


}
