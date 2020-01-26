package controller;


import services.ServiceException;

interface Command {
     String execute(String request) throws ServiceException;
}
