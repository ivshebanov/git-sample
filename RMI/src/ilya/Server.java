package ilya;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server implements Runnable {
    private final static String DOUBLE_STRING = "double.string";
    public static Registry registry;

    @Override
    public void run() {
        try {
            final DoubleString doubleString = new DoubleString();
            registry = LocateRegistry.createRegistry(2099);
            registry.bind(DOUBLE_STRING, doubleString);
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
