import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

    @Before
    public void before(){
        room = new Room(RoomType.DOUBLE);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, room.getRoomType());
    }

//    @Test
//    public void roomTypeCanBeMisspelled(){
//        room = new Room( "Doooouble");
//        assertEquals("Doooouble", room.getRoomType());
//    }

    @Test
    public void doubleHasValue2() {
        assertEquals(2, room.getValueFromEnum());
    }


}
