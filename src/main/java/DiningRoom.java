import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> diningGuests;

    public DiningRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.diningGuests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getName(){
        return this.name;
    }

    public int getGuestCount(){
        return this.diningGuests.size();
    }

    public boolean isFull(){
        return this.diningGuests.size() >= this.capacity;
    }

    public void addGuestToRoom(Guest guest){
            this.diningGuests.add(guest);
            this.capacity -= 1;

    }

    public void removeGuestFromRoom(Guest guest){
        this.diningGuests.remove(guest);
        this.capacity += 1;
    }

}
