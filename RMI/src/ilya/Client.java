package ilya;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public class Client implements Runnable {
    private final static String DOUBLE_STRING = "double.string";
    private Registry registry = Server.registry;

    @Override
    public void run() {
        try {
            Move move = (DoubleString) registry.lookup(DOUBLE_STRING);
            System.out.println(move.doubleString("Ilyadf"));
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }

    }
}
