package controller.command;

public class ExitRequest implements Command {
    @Override
    public String execute(String request)  {
        return "exit";
    }
}
