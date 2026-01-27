package Commands;

import Player.Inventory;
import Player.Player;
import World.RoomManager;

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


        return "";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
