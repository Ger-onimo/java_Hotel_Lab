import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> bedroomGuests;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.bedroomGuests = new ArrayList<>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getRoomType(){
        return this.roomType;
    }

    public int getGuestCount(){
        return this.bedroomGuests.size();
    }

    public boolean isFull(){
        return this.bedroomGuests.size() >= this.capacity;
    }

    public void addGuestToRoom(Guest guest){
            this.bedroomGuests.add(guest);
            this.capacity -= 1;
    }

    public void removeGuestFromRoom(Guest guest){
        this.bedroomGuests.remove(guest);
        this.capacity += 1;
    }
}
