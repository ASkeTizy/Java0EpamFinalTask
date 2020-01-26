package services;

public class ServiceFactory {
    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return new ServiceFactory();
    }

    public ClientService getClientService() {
        return new ClientService();
    }
}
