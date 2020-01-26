package controller;

import controller.Command;
import services.ClientService;
import services.ServiceFactory;

public class SignIn implements Command {


    @Override
    public String execute(String request)  {
        String login="Artiom";
        String password="1111";
        String response=null;

        ServiceFactory serviceFactory=ServiceFactory.getInstance();
        ClientService clientService=serviceFactory.getClientService();

        clientService.signIn(login,password);
        response="Hello";
        System.out.println(response+login+password);
        return response;
    }
}
