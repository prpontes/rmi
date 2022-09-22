package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import rmi.Numero;
/**
 *
 * @author Paulo
 */
public class Cliente {
    
    public static void main(String args[]){
        try{
            InterfaceServicos s = (InterfaceServicos) Naming.lookup("//localhost/servicos");
            Numero a = new Numero();
            a.setNumero(2);
            Numero b = new Numero();
            b.setNumero(5);
            Numero resultado = new Numero();
            resultado.setNumero(s.soma(a, b).getNumero());
            System.out.printf("%d + %d = %d", a.getNumero(), b.getNumero(), resultado.getNumero());
        }catch(NotBoundException e){
            e.printStackTrace();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(RemoteException e){
            e.printStackTrace();
        }
    }
}
