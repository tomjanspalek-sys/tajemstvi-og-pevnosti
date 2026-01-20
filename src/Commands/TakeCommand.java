package Commands;

public class TakeCommand implements Command{
    @Override
    public String execute(String[] args) {
        return "";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
