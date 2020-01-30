package controller.command;


import controller.ControllerException;

public interface Command {
     String execute(String request) throws ControllerException;
}
