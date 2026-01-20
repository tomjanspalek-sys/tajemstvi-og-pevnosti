package Commands;

public interface Command {

    public String execute(String[] args);

    public boolean isExit();

}
