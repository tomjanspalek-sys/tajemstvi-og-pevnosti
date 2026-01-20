package Commands;

import Player.*;
import World.RoomManager;

public class StatsCommand implements Command {

    Inventory inventory;
    Player player;
    RoomManager roomManager;

    public StatsCommand(Player player, Inventory inventory, RoomManager roomManager) {
        this.inventory = inventory;
        this.player = player;
        this.roomManager = roomManager;
    }

    @Override
    public String execute(String[] args) {
        return "Currently located at: " + player.getCurrentRoomName() + "\n" +
                "Inventory: " + null + "\n" +
                "-------------------------------------------------------------";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
