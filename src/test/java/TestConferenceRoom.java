import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestConferenceRoom {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(50, "Castle Suite");
        guest = new Guest();
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Castle Suite", conferenceRoom.getName());
    }

    @Test
    public void conferenceRoomIsFull() {
        assertFalse(conferenceRoom.isFull());
    }

    @Test
    public void testAddGuestToRoom() {
        conferenceRoom.addGuestToRoom(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void testRemoveGuestToRoom() {
        conferenceRoom.addGuestToRoom(guest);
        conferenceRoom.addGuestToRoom(guest);
        assertEquals(2, conferenceRoom.getGuestCount());
        conferenceRoom.removeGuestFromRoom(guest);
        assertEquals(1, conferenceRoom.getGuestCount());

    }
}
