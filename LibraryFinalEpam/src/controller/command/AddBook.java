package controller.command;

import controller.ControllerException;
import controller.command.Command;
import controller.scanner.DataScanner;
import services.ClientService;
import services.ServiceException;
import services.ServiceFactory;

public class AddBook implements Command {

    @Override
    public String execute(String request) throws ControllerException {
        String name=DataScanner.getLine();
        String author=DataScanner.getLine();
        String response=null;

        ServiceFactory serviceFactory=ServiceFactory.getInstance();
        ClientService clientService=serviceFactory.getClientService();
        try {
            clientService.addBook(name,author);
        } catch (ServiceException e) {
            response="Book not added";
        }
        return "You added book";
    }
}
