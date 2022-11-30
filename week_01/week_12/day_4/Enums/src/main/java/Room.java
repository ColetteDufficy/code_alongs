public class Room {

//    public String roomType; //modified- the original code
    private RoomType roomType; //modified

    public Room(RoomType roomType){ //modified public Room(String roomType)
        this.roomType = roomType;
    }

    public RoomType getRoomType(){ //modified
        return this.roomType;
    }

    public int getValueFromEnum() {
        return this.roomType.getValue();
    }

}
