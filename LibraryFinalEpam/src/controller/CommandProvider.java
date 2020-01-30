package controller;

import controller.command.*;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandName, Command> repository =new HashMap<>();
    CommandProvider(){
        repository.put(CommandName.SIGN_IN,new SignIn());
        repository.put(CommandName.REGISTRATION,new Register());
        repository.put(CommandName.ADD_BOOK,new AddBook());
        repository.put(CommandName.WRONG_REQUEST,new WrongRequest());
        repository.put(CommandName.EXIT,new ExitRequest());
        repository.put(CommandName.FIND_BOOK,new FindBook());
    }

    public Command getCommand(String name) {
        CommandName commandName=null;
        Command command=null;
        try {
            commandName=CommandName.valueOf(name.toUpperCase());
            command=repository.get(commandName);
        }catch (IllegalArgumentException | NullPointerException e){
            command=repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
