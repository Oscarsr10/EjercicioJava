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
public class Coche {
    private int nPuertas;
    private String marca;
    private String codigo;

    public Coche() {
    }

    public Coche(int nPuertas, String marca, String codigo) {
        this.nPuertas = nPuertas;
        this.marca = marca;
        this.codigo = codigo;
    }
    public void arrancarCoche(Llave llave) {
        if(this.codigo.compareTo(llave.dameCodigo()) ==0) {
        }
    }
}
