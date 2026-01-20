package World;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class GameMapLoader {

    public RoomManager getRoomManager() {
        return roomManager;
    }

    private RoomManager roomManager;

    public void Load(String resourcePath){
        ObjectMapper parser = new ObjectMapper();
        try{
            InputStream input = new FileInputStream(resourcePath);
            roomManager = parser.readValue(input, RoomManager.class);
            /*System.out.println(roomManager.toString());*/

        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
