package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Paulo
 */
public class Servicos extends UnicastRemoteObject implements InterfaceServicos{

    public Servicos() throws RemoteException{
        super();
    }
    
    @Override
    public Numero soma(Numero x, Numero y) throws RemoteException {
        
        Numero z = new Numero();
        z.setNumero(x.getNumero()+y.getNumero());
        return z;
    }
}
