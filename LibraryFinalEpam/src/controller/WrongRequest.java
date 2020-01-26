package controller;

import services.ServiceException;

public class WrongRequest implements Command {

    @Override
    public String execute(String request) throws ServiceException {
        return null;
    }
}
