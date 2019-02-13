import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private DiningRoom diningRoom;
    private Guest guest;
    private Booking booking;



    @Before
    public void before(){
        hotel = new Hotel();
        guest = new Guest();
        diningRoom = new DiningRoom(5,"Dining Room");
        conferenceRoom = new ConferenceRoom(3, "Castle Suite");
        bedroom = new Bedroom(1,2, "Double");
        booking = new Booking(3, bedroom);
    }

    @Test
    public void testCheckInDiningRooms() {
        hotel.checkInDiningRooms(diningRoom, guest);
        assertEquals(1, hotel.diningRoomsCount());
        assertEquals(1, diningRoom.getGuestCount());
        assertEquals(4, diningRoom.getCapacity());
    }

    @Test
    public void testCheckOutDiningRooms() {
        hotel.checkOutDiningRooms(diningRoom, guest);
        assertEquals(0,hotel.diningRoomsCount());
        assertEquals(0,diningRoom.getGuestCount());
        assertEquals(5, diningRoom.getCapacity());
    }

    @Test
    public void testCheckInConferenceRooms() {
        hotel.checkInConferenceRooms(conferenceRoom, guest);
        assertEquals(1, hotel.conferenceRoomsCount());
        assertEquals(1, conferenceRoom.getGuestCount());
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void testCheckOutConferenceRooms() {
        hotel.checkOutConferenceRooms(conferenceRoom, guest);
        assertEquals(0,hotel.conferenceRoomsCount());
        assertEquals(0,conferenceRoom.getGuestCount());
        assertEquals(3, conferenceRoom.getCapacity());
    }

    @Test
    public void testCheckInBedrooms() {
        hotel.checkInBedrooms(bedroom, guest);
        assertEquals(1, hotel.bedroomsCount());
        assertEquals(1, bedroom.getGuestCount());
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void testCheckOutBedrooms() {
        hotel.checkOutBedrooms(bedroom, guest);
        assertEquals(0,hotel.bedroomsCount());
        assertEquals(0,bedroom.getGuestCount());
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void testBookingRoom(){

        assertEquals(Booking, hotel.bookRoom(booking));

    }



}
