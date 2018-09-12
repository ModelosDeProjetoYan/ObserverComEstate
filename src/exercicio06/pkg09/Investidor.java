/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06.pkg09;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author YanNotebook
 */
public class Investidor implements Observer {

    public Investidor(Observable acao) {
        acao.addObserver(this);
    }

    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof Empresa) {
            Empresa a = (Empresa) o;
            System.out.println(a.getSituacao());
        }
    }

}
