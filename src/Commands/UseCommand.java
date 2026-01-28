package Commands;

import Player.*;
import World.RoomManager;

public class UseCommand implements Command{

    RoomManager roomManager;
    Player player;
    Inventory inventory;

    //TODO predpripravit/dodelat prikaz use
    @Override
    public String execute(String[] args) {
        return "";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
