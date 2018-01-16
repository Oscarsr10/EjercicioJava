/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Oscar
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche1 = new Coche(3,"Seat","hola");
        Llave bonita = new Llave("afadfas");
        bonita.reset(2900);
        bonita.dameCodigo();
        coche1.arrancarCoche(bonita);
    }
    
}
