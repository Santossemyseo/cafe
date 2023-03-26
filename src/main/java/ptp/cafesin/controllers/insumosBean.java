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
@Named(value = "insumosBean")
@SessionScoped
public class insumosBean implements Serializable {
    
    @EJB
    private CategoriaFacade catf;
    private Categoria cat = new Categoria();
    private Integer insidcat;
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
    private Integer ordcomsel;
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

    /**
     * Creates a new instance of adminBean
     */
    public insumosBean() {
    }
    
    public List<Insumos> findAll(){
        return insf.findAll();
    }
     
   
     
    
    public void update (Insumos ins){
        this.setIns(ins);
        this.setOrdcomsel(ins.getInsOrdcom().getOrdcomIdprov().getIdprov());
        this.setInsidcat(ins.getInsCatCod().getIdcategoria());
    }
    
    public void clear(){
        ins = new Insumos();
        
    }
    
    public void delete(Colaboradores col){
        colf.remove(col);
    }
    
    public void save(){
        Ordencompras odc = new Ordencompras();
        Categoria ct = new Categoria();
        cat.setIdcategoria(getOrdcomsel());
        ordc.setIdfact(getInsidcat());
        ins.setInsOrdcom(odc);
        ins.setInsCatCod(ct);
        if(ins.getCodInsumos()!= null){
            ins.setUpdatedAt(new Date());
            insf.edit(getIns());
        }else {
            ins.setCreatedAt(new Date());
            ins.setUpdatedAt(new Date());
            insf.create(getIns());
        }
        ins = new Insumos();
        fechaActual = new Date();
        ordc = new Ordencompras();
        cat = new Categoria();
    }
    
    public List<Insumos> getAllInsumos(){
        return insf.findAll();
    }
    public List<Categoria> getCategoria(){
        return catf.findAll();
    }
    
    public List<Ordencompras> getOrdencompras(){
        return ordcf.findAll();
    }
    
    public List<Proveedor> getProveedor(){
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
     * @return the insidcat
     */
    public Integer getInsidcat() {
        return insidcat;
    }

    /**
     * @param insidcat the insidcat to set
     */
    public void setInsidcat(Integer insidcat) {
        this.insidcat = insidcat;
    }

    /**
     * @return the ordcomsel
     */
    public Integer getOrdcomsel() {
        return ordcomsel;
    }

    /**
     * @param ordcomsel the ordcomsel to set
     */
    public void setOrdcomsel(Integer ordcomsel) {
        this.ordcomsel = ordcomsel;
    }
 
    
    
}
