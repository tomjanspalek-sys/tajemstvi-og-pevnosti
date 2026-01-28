import Commands.GameConsole;
import Player.*;
import Util.CompFunc;
import World.GameMapLoader;

public class Game {

    CompFunc cf = new CompFunc();


    public void startGame() {
        GameMapLoader GML = new GameMapLoader();
        GML.Load("resources/gamedata.json");
        System.out.println("Game loaded..");

        cf.Sleep(500);

        GameConsole gc = new GameConsole();
        Player p = new Player(1,GML.getRoomManager());
        Inventory inv = new Inventory();

        /*System.out.println(p.getCurrentRoomName());*/
        gc.start(p,GML.getRoomManager(), inv);


    }
    public void endGame() {
    }

    public boolean isGameRunning() {
        return false;
    }

    public boolean checkWinCondition() {
        return false;
    }
}
