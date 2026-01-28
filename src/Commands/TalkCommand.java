package Commands;

import Player.Player;
import World.RoomManager;
import World.Character;

import java.util.Random;

public class TalkCommand implements Command{

    private RoomManager roomManager;
    private Player player;

    public TalkCommand(RoomManager roomManager, Player player) {
        this.roomManager = roomManager;
        this.player = player;
    }

//TODO dodelat dialogy postav
    @Override
    public String execute(String[] args) {
        int currID = player.getRoomID();
        Character character = null;
        boolean isMatch = false;
        String finalMesg = null;

        for (int i = 0; i < roomManager.getCharacters().size(); i++) {
            if (currID==roomManager.getCharacters().get(i).getCurrentRoom()){
                isMatch = true;
                character = roomManager.getCharacters().get(i);
            }
        }

        System.out.println();
        finalMesg = character.getName()+": ,,"+character.getDialogues().get(1)+"'' ";

        return finalMesg;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
