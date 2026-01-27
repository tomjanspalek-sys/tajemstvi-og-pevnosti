package Player;
import World.Item;
import java.util.ArrayList;


public class Inventory {

    private ArrayList<Item> inventory;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
    }

    public boolean addItem(Item item) {
        return inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public boolean isFull() {
        if (inventory.size() == capacity) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + inventory;
    }
}
