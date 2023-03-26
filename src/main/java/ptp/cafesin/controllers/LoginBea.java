/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ptp.cafesin.controllers;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import ptp.cafesin.entitys.Colaboradores;
import ptp.cafesin.entitys.Rol;
import ptp.cafesin.services.ColaboradoresFacade;

/**
 *
 * @author Primero tu Pais
 */
@Named(value = "loginBea")
@RequestScoped
public class LoginBea {
    
    private String correo;
    private String pass;
    @EJB
    private ColaboradoresFacade cf;
    private String msj;
    

    /**
     * Creates a new instance of LoginBea
     */
    public LoginBea() {
    }
    
    public void login() throws IOException{
         List<Colaboradores> col = cf.login(correo, pass);
        if (col.isEmpty() != true) {
            Rol rol = col.get(0).getUsRolId();
            if (rol.getDescripcionRol().equals("Admin")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("Admin.xhtml");
            } else if (rol.getDescripcionRol().equals("Cajero")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("Ventas.xhtml");
            } else if (rol.getDescripcionRol().equals("Program")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("Program.xhtml");
        }}else {
                msj = "reintentar";
            }}
            /**
             * @return the correo
             */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the msj
     */
    public String getMsj() {
        return msj;
    }

    /**
     * @param msj the msj to set
     */
    public void setMsj(String msj) {
        this.msj = msj;
    }
}
