package controller;

public class ControllerException extends Exception{
    public ControllerException(String message){
        super(message);

    }
    public ControllerException(String message,Exception e){
        super(message,e);
        System.out.println(e.getMessage());
    }
}
