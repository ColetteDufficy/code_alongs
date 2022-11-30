public enum RoomType { //creating a container of values under the ENUM class type. Have to uppercase
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4);

    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
