/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public int soma(int x, int y) throws RemoteException {
        return x+y;
    } 
}
