/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ptp.cafesin.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Calendar;
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
@Named(value = "user")
@SessionScoped
public class userBean implements Serializable {

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
    private ProductoFacade prodf;
    private Producto prod = new Producto();
    @EJB
    private ProveedorFacade provf;
    private Proveedor prov = new Proveedor();
    @EJB
    private RolFacade rlf;
    private Integer numDocColidrolSel;
    @EJB
    private TurnosFacade trf;
    private Turnos tr = new Turnos();
    private Integer colidtr;
    @EJB
    private VentaFacade vntf;
    private Venta vnt = new Venta();
    private Date fechaActual = new Date();
    

    /**
     * Creates a new instance of User
     */
    public userBean() {
    }

    public List<Colaboradores> findAll() {
        return colf.findAll();
    }

    public void update(Colaboradores col) {
        this.setCol(col);
        this.setNumDocColidrolSel(col.getUsRolId().getIdrol());
        this.setColidtr(col.getUsTurnId().getIdTurno());
    }

    public void clear() {
        col = new Colaboradores();
    }

    public void delete(Colaboradores col) {
        colf.remove(col);
    }

    public void save() {
        Rol rl = new Rol();
        Turnos tr = new Turnos();
        rl.setIdrol(getNumDocColidrolSel());
        tr.setIdTurno(getColidtr());
        getCol().setUsRolId(rl);
        getCol().setUsTurnId(tr);
        if (getCol().getIdcol() != null) {
            col.setUpdatedAt(new Date());
            fechaActual.setDate(fechaActual.getDate() + 1);
            col.setFechaTurno(fechaActual);
            colf.edit(getCol());
        } else {
            col.setCreatedAt(new Date());
            col.setUpdatedAt(new Date());
            fechaActual.setDate(fechaActual.getDate() + 1);
            col.setFechaTurno(fechaActual);
            colf.create(getCol());

        }
        col =new Colaboradores();
        fechaActual = new Date();
    }

    public List<Rol> getAllRol() {
        return rlf.findAll();
    }

    public List<Turnos> getAllTurnos() {
        return trf.findAll();
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
        return prod;
    }

    /**
     * @param prod the prod to set
     */
    public void setProd(Producto prod) {
        this.prod = prod;
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
    public Integer getNumDocColidrolSel() {
        return numDocColidrolSel;
    }

    /**
     * @param numDocColidrolSel the numDocColidrolSel to set
     */
    public void setNumDocColidrolSel(Integer numDocColidrolSel) {
        this.numDocColidrolSel = numDocColidrolSel;
    }

    /**
     * @return the tr
     */
    public Turnos getTr() {
        return tr;
    }

    /**
     * @param tr the tr to set
     */
    public void setTr(Turnos tr) {
        this.tr = tr;
    }

    /**
     * @return the colidtr
     */
    public Integer getColidtr() {
        return colidtr;
    }

    /**
     * @param colidtr the colidtr to set
     */
    public void setColidtr(Integer colidtr) {
        this.colidtr = colidtr;
    }

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

}
