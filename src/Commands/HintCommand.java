package Commands;

public class HintCommand implements Command{
    @Override
    public String execute(String[] args) {
        return "";
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
