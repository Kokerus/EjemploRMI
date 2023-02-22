package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TestRemote extends Remote {
    String sayHello(String name) throws RemoteException;
    String sayGoodbye(String name) throws RemoteException;
}
