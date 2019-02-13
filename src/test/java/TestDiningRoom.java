import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestDiningRoom {

    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void before(){
        diningRoom = new DiningRoom(100, "Eatery");
        guest = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, diningRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Eatery", diningRoom.getName());
    }

    @Test
    public void conferenceRoomIsFull() {
        assertFalse(diningRoom.isFull());
    }

    @Test
    public void testAddGuestToRoom() {
        diningRoom.addGuestToRoom(guest);
        assertEquals(1, diningRoom.getGuestCount());
    }

    @Test
    public void testRemoveGuestToRoom() {
        diningRoom.addGuestToRoom(guest);
        diningRoom.addGuestToRoom(guest);
        assertEquals(2, diningRoom.getGuestCount());
        diningRoom.removeGuestFromRoom(guest);
        assertEquals(1, diningRoom.getGuestCount());

    }
}
