/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author Paulo
 */
public class Servidor {
    
    public static void main(String args[]){
        
        try{
            Servicos s = new Servicos();
            Naming.rebind("//localhost/servicos", s);
            System.out.println("Servidor rodando!");
        }catch(RemoteException e){
            e.printStackTrace();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
    }   
}
