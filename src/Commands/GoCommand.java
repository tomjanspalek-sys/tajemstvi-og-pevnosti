package Commands;

import Player.Player;

import java.util.Scanner;
import java.util.Stack;
import World.Connections;
import World.Room;
import World.RoomManager;

import java.util.Optional;

public class GoCommand implements Command{

    String finalMessage = "";

    Player player;
    RoomManager roomManager;

    public GoCommand(Player player, RoomManager roomManager) {
        this.player = player;
        this.roomManager = roomManager;
    }


    @Override
    public String execute(String[] args) {

        Connections connections = roomManager.getRooms().get(player.getRoomID()).getConnections();

        Scanner scanner = new Scanner(System.in);

        switch (args[1]){
            case "south" -> {
                if(connections.getSouth() != null){
                    player.setRoomID(connections.getSouthID());
                    player.setCurrentRoomName(roomManager.getRooms().get(connections.getSouthID()).getName());

                    finalMessage = ("You walked in " + player.getCurrentRoomName());
                }else
                   finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            case "north" -> {
                if(connections.getNorth() != null){
                    player.setRoomID(connections.getNorthID());
                    player.setCurrentRoomName(roomManager.getRooms().get(connections.getNorthID()).getName());

                    finalMessage = ("You walked in " + player.getCurrentRoomName());
                }else
                    finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            case "east" -> {
                if(connections.getEast() != null){
                    player.setRoomID(connections.getEastID());
                    player.setCurrentRoomName(roomManager.getRooms().get(connections.getEastID()).getName());

                    finalMessage = ("You walked in " + player.getCurrentRoomName());
                }else
                    finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            case "west" -> {
                if(connections.getWest() != null){
                    player.setRoomID(connections.getWestID());
                    player.setCurrentRoomName(roomManager.getRooms().get(connections.getWestID()).getName());

                    finalMessage = ("You walked in " + player.getCurrentRoomName());
                }else
                    finalMessage = ("you bumped into wall, i guess there is nowhere i could go in this direction");
            }
            default -> {
                System.out.println("where you want to go:");
                System.out.println("-------------------------------");
                if (connections.getSouth() != null) {
                    System.out.println("South: "+roomManager.getRooms().get(connections.getSouthID()).getName());
                }
                if (connections.getNorth() != null) {
                    System.out.println("North: "+roomManager.getRooms().get(connections.getNorthID()).getName());
                }
                if (connections.getEast() != null) {
                    System.out.println("East: "+roomManager.getRooms().get(connections.getEastID()).getName());
                }
                if (connections.getWest() != null) {
                    System.out.println("West: "+roomManager.getRooms().get(connections.getWestID()).getName());
                }

                args[1] = scanner.nextLine();

                if (args[1].equals("exit")||args[1].equals("quit")) {
                    break;
                }
                execute(args);
            }

        }

        return finalMessage;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
