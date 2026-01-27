package Commands;

import Player.Inventory;
import Player.Player;
import World.*;

public class TakeCommand implements Command{

    private RoomManager roomManager;
    private Inventory inventory;
    private Player player;

    public TakeCommand(RoomManager roomManager, Inventory inventory, Player player) {
        this.roomManager = roomManager;
        this.inventory = inventory;
        this.player = player;
    }

    @Override
    public String execute(String[] args) {
            int currID = player.getRoomID();

           if (args[1].equalsIgnoreCase(roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(0)).getName())){
               inventory.addItem(roomManager.getItems().get(roomManager.getRooms().get(currID).getItems().get(0)));
           }

//TODO spravit nasypavani veci do inv

        return inventory.toString();
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
