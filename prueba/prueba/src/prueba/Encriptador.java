/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author alex_
 */
public class Encriptador {
    //metodos
    public int encriptar(int param1,Algoritmo param2){
        return param2.encriptar(param1);
    }
    public int desencriptar(int param1,Algoritmo param2){
        return param2.desencriptar(param1);
    }
}
