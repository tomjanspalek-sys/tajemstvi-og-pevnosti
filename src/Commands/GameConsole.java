package Commands;

import Player.*;
import World.RoomManager;

import java.util.HashMap;
import java.util.Scanner;

public class GameConsole {


    private HashMap<String, Command> commands;
    private boolean isExit;
    private Scanner scanner;

    public GameConsole() {
        commands = new HashMap<>();
        isExit = false;
        scanner = new Scanner(System.in);
    }

    public void inicilization(Player player, RoomManager roomManager, Inventory inventory) {
        commands.put("go", new GoCommand(player, roomManager));
        commands.put("exit", new StopCommand());
        commands.put("stats", new StatsCommand(player, inventory, roomManager));
        commands.put("help", new HelpCommand());
        commands.put("take", new TakeCommand(roomManager, inventory, player));
    }

    public void execute() {
        System.out.print(">>");
        String command = scanner.nextLine()+" "+null;
        command = command.trim().toLowerCase();
        String commandInput[]  = command.split(" ");

        if(commands.containsKey(commandInput[0])) {
            System.out.println(commands.get(commandInput[0]).execute(commandInput));
            isExit = commands.get(commandInput[0]).isExit();
        }else{
            System.out.println("Command is not recognized | use 'help' for list of all commands");
        }
    }

    public void start(Player player, RoomManager roomManager, Inventory inventory) {
        inicilization(player, roomManager, null);
        do {
            execute();
        }while(!isExit);
    }


}
