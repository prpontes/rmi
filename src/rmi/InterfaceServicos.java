package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import rmi.Numero;
/**
 *
 * @author Paulo
 */
public interface InterfaceServicos extends Remote {
    
    public Numero soma(Numero x, Numero y) throws RemoteException;
}
