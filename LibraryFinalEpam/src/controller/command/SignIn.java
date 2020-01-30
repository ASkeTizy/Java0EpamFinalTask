package controller.command;

import controller.ControllerException;
import controller.command.Command;
import controller.scanner.DataScanner;
import services.ClientService;
import services.ServiceException;
import services.ServiceFactory;

public class SignIn implements Command {


    @Override
    public String execute(String request) throws ControllerException {

        String login= DataScanner.getLine();
        String password=DataScanner.getLine();
        String response=null;

        ServiceFactory serviceFactory=ServiceFactory.getInstance();
        ClientService clientService=serviceFactory.getClientService();

        try {
           if(!clientService.signIn(login,password)) throw new ServiceException("No such name");
            response="Hello";
        } catch (ServiceException e) {
            // throw new ControllerException("sign in command error",e);
            response="No such name";

        }


        return response;
    }
}
