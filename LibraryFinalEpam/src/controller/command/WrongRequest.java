package controller.command;

import controller.command.Command;

public class WrongRequest implements Command {

    @Override
    public String execute(String request)  {

        return "No such command";
    }
}
