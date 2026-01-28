package Commands;

import Player.*;
import World.RoomManager;

public class UseCommand implements Command{

    private RoomManager roomManager;
    private Player player;
    private Inventory inventory;

    public UseCommand(RoomManager roomManager, Player player, Inventory inventory){
        this.roomManager = roomManager;
        this.player = player;
        this.inventory = inventory;
    }

    //TODO dodelat prikaz use
    @Override
    public String execute(String[] args) {
        return "wip";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
