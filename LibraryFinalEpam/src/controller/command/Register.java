package controller.command;

import controller.ControllerException;
import controller.scanner.DataScanner;
import services.ClientService;
import services.ServiceException;
import services.ServiceFactory;

public class Register implements Command {
    @Override
    public String execute(String request) throws ControllerException {
        String login= DataScanner.getLine();
        String password=DataScanner.getLine();
        String response=null;

        ServiceFactory serviceFactory=ServiceFactory.getInstance();
        ClientService clientService=serviceFactory.getClientService();

        try {
            clientService.registrate(login,password);
        } catch (ServiceException e) {
            response="Registration failed";
        }
        response="Welcome new user";

        return response;

    }
}
