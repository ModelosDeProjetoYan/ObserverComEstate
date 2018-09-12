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
public class EmpresaRentavel implements EmpresaDesejadas{

     @Override
    public void setEstagnada(Empresa a) {
        a.setEmpresa(new EmpresaEstagnada());
    }

    @Override
    public void setVulneravel(Empresa a) {
        a.setEmpresa(new EmpresaVulneravel());
    }

    @Override
    public void setFalencia(Empresa a) {
        a.setEmpresa(new EmpresaAlertaFalencia());
    }

    @Override
    public void setRentavel(Empresa a) {
        a.setEmpresa(new EmpresaRentavel());
    }

    @Override
    public void setMuitoRentavel(Empresa a) {
        a.setEmpresa(new EmpresaMuitoRentavel());
    
    }

    @Override
    public String getSituacao() {
        return "empresa RENTAVEL";    
    }
    
}
