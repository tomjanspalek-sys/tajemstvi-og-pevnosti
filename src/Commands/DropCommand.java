package Commands;

import Player.Inventory;
import Player.Player;
import World.Item;
import World.RoomManager;

import java.util.Arrays;
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
            Item[] items = new Item[2];
        for (int i = 0; i < inventory.getInventory().size(); i++) {
            items[i] = inventory.getInventory().get(i);
        }

        String[] item1 = null;
        String[] item2 = null;
        if (items[0]!=null) {
            item1 = items[0].getName().split(" ");
        }
        if (items[1]!=null) {
            item2 = items[1].getName().split(" ");
        }
        System.out.println(Arrays.toString(item1));



        return "";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
