package World;

import Player.Inventory;

public class Exit {
    private boolean isEnd = false;

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public boolean winCondition(boolean input, Inventory inventory) {
            return !isEnd;
    }


}
