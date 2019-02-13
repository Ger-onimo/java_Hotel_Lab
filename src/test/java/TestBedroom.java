import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestBedroom {

    private Guest guest;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2,2, "Double");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(2,bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Double", bedroom.getRoomType());
    }

    @Test
    public void bedroomIsFull(){
        assertFalse(bedroom.isFull());
    }

    @Test
    public void testAddGuestToRoom(){
        bedroom.addGuestToRoom(guest);
        assertEquals(1,bedroom.getGuestCount());
    }

    @Test
    public void testRemoveGuestToRoom(){
        bedroom.addGuestToRoom(guest);
        bedroom.addGuestToRoom(guest);
        assertEquals(2,bedroom.getGuestCount());
        bedroom.removeGuestFromRoom(guest);
        assertEquals(1,bedroom.getGuestCount());

    }

}
