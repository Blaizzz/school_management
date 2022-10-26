package efrei.fr;

public class Classroom {

    private String roomNumber;
    private Integer size;

    public Classroom(String roomNumber, Integer size) {
        this.roomNumber = roomNumber;
        this.size = size;
    }

    public Classroom() {}

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", size=" + size +
                '}';
    }
}
