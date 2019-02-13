import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();

    }

    public void checkInBedrooms(Bedroom bedroom, Guest guest){
        if(!bedroom.isFull()){
            this.bedrooms.add(bedroom);
            bedroom.addGuestToRoom(guest);
        }

    }

    public void checkOutBedrooms(Bedroom bedroom, Guest guest) {
        if (bedroom.isFull()) {
            this.bedrooms.remove(bedroom);
            bedroom.removeGuestFromRoom(guest);
        }
    }

    public int bedroomsCount(){
        return this.bedrooms.size();
    }

    public void checkInDiningRooms(DiningRoom diningRoom, Guest guest){
        if(!diningRoom.isFull()){
            this.diningRooms.add(diningRoom);
            diningRoom.addGuestToRoom(guest);
        }

    }

    public void checkOutDiningRooms(DiningRoom diningRoom, Guest guest) {
        if (diningRoom.isFull()) {
            this.diningRooms.remove(diningRoom);
            diningRoom.removeGuestFromRoom(guest);
        }
    }

    public int diningRoomsCount(){
        return this.diningRooms.size();
    }

    public void checkInConferenceRooms(ConferenceRoom conferenceRoom, Guest guest){
        if(!conferenceRoom.isFull()){
            this.conferenceRooms.add(conferenceRoom);
            conferenceRoom.addGuestToRoom(guest);
        }

    }

    public void checkOutConferenceRooms(ConferenceRoom conferenceRoom, Guest guest) {
        if (conferenceRoom.isFull()) {
            this.conferenceRooms.remove(conferenceRoom);
            conferenceRoom.removeGuestFromRoom(guest);
        }
    }

    public int conferenceRoomsCount(){
        return this.conferenceRooms.size();
    }

    public Booking bookRoom(Booking booking){
        Booking obj = null;
        checkInBedrooms(booking )

        return obj;
    }




}
