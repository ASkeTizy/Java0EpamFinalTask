package controller.command;

import controller.ControllerException;
import controller.scanner.DataScanner;
import services.ClientService;
import services.ServiceException;
import services.ServiceFactory;

public class FindBook implements Command  {



    @Override
    public String execute(String request) throws ControllerException {
        String name= DataScanner.getLine();
        String author=DataScanner.getLine();
        String response=null;

        ServiceFactory serviceFactory=ServiceFactory.getInstance();
        ClientService clientService=serviceFactory.getClientService();

        try {
            if(!clientService.findBook(name,author)) throw new ServiceException("No such name");
            response="Uou find it";

        } catch (ServiceException e) {
            // throw new ControllerException("sign in command error",e);
            response="No such author";

        }
        return response;
    }



}

