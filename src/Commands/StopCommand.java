package Commands;

public class StopCommand implements Command{

    @Override
    public String execute(String[] args) {
        return "Shutting down";
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
