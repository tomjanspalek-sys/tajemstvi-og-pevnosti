package Player;
import World.Item;
import lombok.Getter;

import java.util.ArrayList;


public class Inventory {

    @Getter
    private ArrayList<Item> inventory = new ArrayList<>();
    private int capacity = 2;

    public boolean addItem(Item item) {

        if (!isFull()){
            return inventory.add(item);
        }else
            System.out.println("Can't pickup another item, inventory is full");
        return false;

    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public boolean isFull() {
        return inventory.size() == capacity;
    }

    @Override
    public String toString() {
        String finalMesg = "";
        for (int i = 0; i < inventory.size(); i++) {
            finalMesg = finalMesg + inventory.get(i).getName()+", ";
        }
        return finalMesg;
    }
}
