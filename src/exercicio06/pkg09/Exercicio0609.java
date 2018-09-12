/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06.pkg09;

/**
 *
 * @author YanNotebook
 */
public class Exercicio0609 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa a = new Empresa();
        Empresa a1 = new Empresa();
        Empresa a2 = new Empresa();
        Investidor i= new Investidor(a);
        a2.addObserver(i);
        a2.setRentavel();
    }
    
}
