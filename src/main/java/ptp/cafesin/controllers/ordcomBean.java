/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ptp.cafesin.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import ptp.cafesin.entitys.Categoria;
import ptp.cafesin.entitys.Clientes;
import ptp.cafesin.entitys.Colaboradores;
import ptp.cafesin.entitys.Insumos;
import ptp.cafesin.entitys.Ordencompras;
import ptp.cafesin.entitys.Producto;
import ptp.cafesin.entitys.Proveedor;
import ptp.cafesin.entitys.Rol;
import ptp.cafesin.entitys.Turnos;
import ptp.cafesin.entitys.Venta;
import ptp.cafesin.services.CategoriaFacade;
import ptp.cafesin.services.ClientesFacade;
import ptp.cafesin.services.ColaboradoresFacade;
import ptp.cafesin.services.InsumosFacade;
import ptp.cafesin.services.OrdencomprasFacade;
import ptp.cafesin.services.ProductoFacade;
import ptp.cafesin.services.ProveedorFacade;
import ptp.cafesin.services.RolFacade;
import ptp.cafesin.services.TurnosFacade;
import ptp.cafesin.services.VentaFacade;

/**
 *
 * @author Primero tu Pais
 */
@Named(value = "ordcomBean")
@SessionScoped
public class ordcomBean implements Serializable {
    
    @EJB
    private CategoriaFacade catf;
    private Categoria cat = new Categoria();
    @EJB
    private ClientesFacade clif;
    private Clientes cli = new Clientes();
    @EJB
    private ColaboradoresFacade colf;
    private Colaboradores col = new Colaboradores();
    @EJB
    private InsumosFacade insf;
    private Insumos ins = new Insumos();
    @EJB
    private OrdencomprasFacade ordcf;
    private Ordencompras ordc = new Ordencompras();
    @EJB
    private ProductoFacade prdf;
    private Producto prd = new Producto();
    @EJB
    private ProveedorFacade provf;
    private Proveedor prov = new Proveedor();
    @EJB
    private RolFacade rlf;
    @EJB
    private TurnosFacade trf;
    private Turnos tr = new Turnos();
    @EJB
    private VentaFacade vntf;
    private Venta vnt = new Venta();
    private Date fechaActual = new Date();
    private Integer ordidprov;

    /**
     * Creates a new instance of adminBean
     */
    public ordcomBean() {
    }
    
    public List<Producto> findAll(){
        return prdf.findAll();
    }
     
    
     
    
    public void update (Ordencompras ordc){
        this.setOrdc(ordc);
    }
    
    public void clear(){
        ordc = new Ordencompras();
    }
    
    public void delete(Ordencompras ordc){
        ordcf.remove(ordc);
    }
    
    public void save(){
        Proveedor pr = new Proveedor();
        pr.setIdprov(getOrdidprov());
        getOrdc().setOrdcomIdprov(pr);
        if(getOrdc().getIdfact() != null){
            ordc.setUpdatedAt(new Date());
            ordc.setCreatedAt(fechaActual);
            ordcf.edit(ordc);
            
        }else {
            ordc.setUpdatedAt(fechaActual);
            ordcf.create(ordc);
        }
        ordc = new Ordencompras();
    }
    
    public List<Proveedor> getAllRol(){
        return provf.findAll();
    }
    
    /**
     * @return the cat
     */
    public Categoria getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    /**
     * @return the cli
     */
    public Clientes getCli() {
        return cli;
    }

    /**
     * @param cli the cli to set
     */
    public void setCli(Clientes cli) {
        this.cli = cli;
    }

    /**
     * @return the colf
     */
    public ColaboradoresFacade getColf() {
        return colf;
    }

    /**
     * @param colf the colf to set
     */
    public void setColf(ColaboradoresFacade colf) {
        this.colf = colf;
    }

    /**
     * @return the col
     */
    public Colaboradores getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(Colaboradores col) {
        this.col = col;
    }

    /**
     * @return the ins
     */
    public Insumos getIns() {
        return ins;
    }

    /**
     * @param ins the ins to set
     */
    public void setIns(Insumos ins) {
        this.ins = ins;
    }

    /**
     * @return the ordc
     */
    public Ordencompras getOrdc() {
        return ordc;
    }

    /**
     * @param ordc the ordc to set
     */
    public void setOrdc(Ordencompras ordc) {
        this.ordc = ordc;
    }

    /**
     * @return the prod
     */
    public Producto getProd() {
        return prd;
    }

    /**
     * @param prod the prod to set
     */
    public void setProd(Producto prod) {
        this.prd = prod;
    }

    /**
     * @return the prov
     */
    public Proveedor getProv() {
        return prov;
    }

    /**
     * @param prov the prov to set
     */
    public void setProv(Proveedor prov) {
        this.prov = prov;
    }

    /**
     * @return the numDocColidrolSel
     */
    
    /**
     * @return the vnt
     */
    public Venta getVnt() {
        return vnt;
    }

    /**
     * @param vnt the vnt to set
     */
    public void setVnt(Venta vnt) {
        this.vnt = vnt;
    }


    /**
     * @return the ordidprov
     */
    public Integer getOrdidprov() {
        return ordidprov;
    }

    /**
     * @param ordidprov the ordidprov to set
     */
    public void setOrdidprov(Integer ordidprov) {
        this.ordidprov = ordidprov;
    }
}
