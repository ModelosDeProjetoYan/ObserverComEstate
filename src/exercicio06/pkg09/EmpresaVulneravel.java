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
public class EmpresaVulneravel implements EmpresaDesejadas{

    @Override
    public void setEstagnada(Empresa a) {
    }

    @Override
    public void setVulneravel(Empresa a) {
    }

    @Override
    public void setFalencia(Empresa a) {
        a.setEmpresa(new EmpresaAlertaFalencia());
    }

    @Override
    public void setRentavel(Empresa a) {
    }

    @Override
    public void setMuitoRentavel(Empresa a) {
    }

    @Override
    public String getSituacao() {
        return "empresa pode FALIR";
    }
    
    
}
