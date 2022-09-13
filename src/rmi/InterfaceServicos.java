package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Paulo
 */
public interface InterfaceServicos extends Remote {
    
    public int soma(int x, int y) throws RemoteException;
    public void sub(int x, int y) throws RemoteException;
}
