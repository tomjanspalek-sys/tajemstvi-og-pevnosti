package Commands;

import World.RoomManager;

public class TalkCommand implements Command{

    RoomManager roomManager;
    Character character;

    public TalkCommand(RoomManager roomManager,Character character) {
        this.roomManager = roomManager;
        this.character = character;
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
