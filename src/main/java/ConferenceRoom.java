import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> conferenceGuests;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.conferenceGuests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getName(){
        return this.name;
    }

    public int getGuestCount(){
        return this.conferenceGuests.size();
    }

    public boolean isFull(){
        return this.conferenceGuests.size() >= this.capacity;
    }

    public void addGuestToRoom(Guest guest){
            this.conferenceGuests.add(guest);
            this.capacity -= 1;
    }

    public void removeGuestFromRoom(Guest guest){
        this.conferenceGuests.remove(guest);
        this.capacity += 1;
    }

}
