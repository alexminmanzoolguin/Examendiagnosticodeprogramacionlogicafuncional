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
public class AlgoritmoXOR implements Algoritmo{
    //atributos
    private int num=0;
    //contructores
    public AlgoritmoXOR(int param){
        num=param;
    }

    //metodos
    @Override
    public int encriptar(int param){
        return param ^ num;
    }
    @Override
    public int desencriptar(int param){
        return param ^ num;
    }

   
    
}
