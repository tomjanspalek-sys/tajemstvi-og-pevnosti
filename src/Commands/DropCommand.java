package Commands;

import Player.Inventory;
import Player.Player;
import World.Item;
import World.RoomManager;

import java.util.List;

public class DropCommand implements Command {

    private Inventory inventory;
    private RoomManager roomManager;
    private Player player;

    public DropCommand(Inventory inventory, RoomManager roomManager, Player player) {
        this.inventory = inventory;
        this.roomManager = roomManager;
        this.player = player;
    }

    //TODO dodelat drop mechaniku

    @Override
    public String execute(String[] args) {
        int currID = player.getRoomID();
        List<Item> playerInv = inventory.getInventory();



        return "";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
