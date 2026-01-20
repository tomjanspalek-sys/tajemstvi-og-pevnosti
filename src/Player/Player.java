package Player;
import World.Room;
import World.RoomManager;

public class Player {

    private String roomID;
    private String currentRoomName;

    public Player(String startRoom, RoomManager roomManager) {
        for (int i = 0; i < roomManager.getRooms().size(); i++) {
            if (roomManager.getRooms().get(i).getId().equals(startRoom)) {
                currentRoomName = roomManager.getRooms().get(i).getName();
                roomID = roomManager.getRooms().get(i).getId();
            }
        }
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getCurrentRoomName() {
        return currentRoomName;
    }

    public void setCurrentRoomName(String currentRoomName) {
        this.currentRoomName = currentRoomName;
    }

    public Inventory getInventory() {
        return null;
    }
}
