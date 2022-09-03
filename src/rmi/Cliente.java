/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Paulo
 */
public class Cliente {
    
    public static void main(String args[]){
        try{
            InterfaceServicos s = (InterfaceServicos) Naming.lookup("//localhost/servicos");
            int resultado = s.soma(2, 5);
            System.out.printf("%d + %d = %d", 2, 5, resultado);
        }catch(NotBoundException e){
            e.printStackTrace();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(RemoteException e){
            e.printStackTrace();
        }
    }
}