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
public class Llave {
    private String codigo;

    public Llave(String codigo) {
        this.codigo = codigo;
    }
    public void reset(int nCodigo) {
        if( nCodigo == 2900) {
            codigo = "a1b2";
            System.out.println("Ha sido reseteada");
        }
    }
    public String dameCodigo() {
        return this.codigo;
    }
}
