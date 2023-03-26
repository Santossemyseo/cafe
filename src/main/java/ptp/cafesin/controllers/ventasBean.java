/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ptp.cafesin.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;
import ptp.cafesin.controllers.msjBean;
import ptp.cafesin.entitys.Categoria;
import ptp.cafesin.entitys.Clientes;
import ptp.cafesin.entitys.Colaboradores;
import ptp.cafesin.entitys.Insumos;
import ptp.cafesin.entitys.Ordencompras;
import ptp.cafesin.entitys.Producto;
import ptp.cafesin.entitys.Proveedor;
import ptp.cafesin.entitys.Turnos;
import ptp.cafesin.entitys.Venta;
import ptp.cafesin.entitys.Ventahasproducto;
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
import ptp.cafesin.services.VentahasproductoFacade;

/**
 *
 * @author Primero tu Pais
 */
@Named(value = "ventasBean")
@SessionScoped
public class ventasBean implements Serializable {
    
    @EJB
    private ProductoFacade prdf;
    private List<Producto> lprd;
    private String name;
    private Producto prdsel;
    private Producto prd;
    private int cntsel;
    private List<Ventahasproducto> car = new ArrayList<>();
    @EJB
    private VentaFacade vntf;
    private Venta vnt = new Venta();
    @EJB
    private VentahasproductoFacade vnhprf;
    @Inject
    private msjBean msj;
    
    public ventasBean() {
    }
    
    public List<Producto> findAll(){
        return prdf.findAll();
    }
    
    public void findprd(){
        lprd = prdf.fndbynm(getName());
    }
    
    public Long getTotalbuy(){
        Long total = 0L;
        for (Ventahasproducto p : car){
            total = total + (p.getProducId().getValorProducto() * p.getCantidad());
        }
        return total;
    }
    
    public void buy(){
        if (vnt.getVenCliNum() != null){
            vnt.setUpdatedAt(new Date());
            vnt.setValorTotalVenta(getTotalbuy());
            vntf.create(vnt);
            for (Ventahasproducto p : car){
                Producto product = p.getProducId();
                product.setCantidad(product.getCantidad() - p.getCantidad());
                prdf.edit(product);
                p.setVentaId(vnt);
                vnhprf.create(p);
            } 
            car = new ArrayList<>();
            vnt = new Venta();
            msj.setTitulo("bien echo");
            msj.setIcono("sucess");
                    
        } else {
            msj.setTitulo("aun no esta echo");
            msj.setIcono("warning");
        }}
    /**
     * @return the lprd
     */
    public List<Producto> getlprd(){
        return lprd;
    }

    /**
     * @param lprd the lprd to set
     */
    public void setLprd(List<Producto> lprd) {
        this.lprd = lprd;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the prdsel
     */
    public Producto getPrdsel() {
        return prdsel;
    }

    /**
     * @param prdsel the prdsel to set
     */
    public void setPrdsel(Producto prdsel) {
        this.prdsel = prdsel;
    }

    /**
     * @return the cntsel
     */
    public int getCntsel() {
        return cntsel;
    }

    /**
     * @param cntsel the cntsel to set
     */
    public void setCntsel(int cntsel) {
        this.cntsel = cntsel;
    }

    /**
     * @return the car
     */
    public List<Ventahasproducto> getCar() {
        return car;
    }

    /**
     * @param car the car to set
     */
    public void setCar(List<Ventahasproducto> car) {
        this.car = car;
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

    /**
     * @return the msj
     */
    public msjBean getMsj() {
        return msj;
    }

    /**
     * @param msj the msj to set
     */
    public void setMsj(msjBean msj) {
        this.msj = msj;
    }
    
    
    
    
}
    