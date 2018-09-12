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
public interface EmpresaDesejadas {
    public void setEstagnada(Empresa a);
    public void setVulneravel(Empresa a);
    public void setFalencia(Empresa a);
    public void setRentavel(Empresa a);
    public void setMuitoRentavel(Empresa a);
    public String getSituacao();
}
