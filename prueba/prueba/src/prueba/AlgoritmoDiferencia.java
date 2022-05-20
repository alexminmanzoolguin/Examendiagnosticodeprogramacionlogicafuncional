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
public class AlgoritmoDiferencia implements Algoritmo {
    //atributos
    private int num=0;
    //constructores
    public AlgoritmoDiferencia(int param){
    num=param;
    }


    //metodos
    @Override
    public int encriptar(int param){
        return num-param;
    }
    @Override
    public int desencriptar(int param){
        return num-param;
    }
    
}
