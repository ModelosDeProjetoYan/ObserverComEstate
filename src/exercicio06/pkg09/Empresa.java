/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06.pkg09;

import java.util.Observable;

/**
 *
 * @author YanNotebook
 */
public class Empresa extends Observable{
    private EmpresaDesejadas empresa;
    
    public Empresa() {
        empresa= new EmpresaDesejavel();    
    }

    public void adicionaObserver(Investidor x){
        addObserver(x);
    }
    public EmpresaDesejadas getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaDesejadas empresa) {
        this.empresa = empresa;
    }

    public void setEstagnada(){
        empresa.setEstagnada(this);
    }
    public void setVulneravel(){
        empresa.setVulneravel(this);
    }
    public void setFalencia(){
        empresa.setFalencia(this);
        setChanged();
        notifyObservers();
    }
    public void setRentavel(){
        empresa.setRentavel(this);
        setChanged();
        notifyObservers();
    }
    public void setMuitoRentavel(){
        empresa.setMuitoRentavel(this);
        setChanged();
        notifyObservers();
    }
    public String getSituacao(){
        return empresa.getSituacao();
    }


}
