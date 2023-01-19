/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.io.Serializable;

/**
 *
 * @author Paulo Ricardo
 */
public class Numero implements Serializable {
    
    int valor;
    
    public void setNumero(int valor){
        this.valor = valor;
    }
    
    public int getNumero(){
        return valor;
    }
}
