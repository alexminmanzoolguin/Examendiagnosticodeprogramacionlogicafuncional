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
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Ejercicio 1 manzo olguin alex yazmin");
        int codigo= 22091999;
        System.out.println("codigo:D:"+codigo);
       Encriptador e=new Encriptador(); 
        int aux = 0;
        Algoritmo a1;
        a1 = new AlgoritmoMultiplicacion(10);
        aux=e.encriptar(codigo,a1);
        System.out.println("Encriptado xD:"+aux);
        System.out.println("Desencriptado:"+ e.desencriptar(aux,a1));
        
        Algoritmo a2;
        a2 = new AlgoritmoDiferencia(99910922);
        aux=e.encriptar(codigo,a2);
        System.out.println("Encriptado xD:"+aux);
        System.out.println("Desencriptado:"+ e.desencriptar(aux,a2));
        
        Algoritmo a3=new AlgoritmoXOR(22099);
        aux=e.encriptar(codigo,a3);
        System.out.println("Encriptado xD:"+aux);
        System.out.println("Desencriptado:"+ e.desencriptar(aux,a3));
    }
    
}
