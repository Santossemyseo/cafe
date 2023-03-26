/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptp.cafesin.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Primero tu Pais
 */
@Entity
@Table(name = "insumoshasproductos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumoshasproductos.findAll", query = "SELECT i FROM Insumoshasproductos i")})
public class Insumoshasproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinshasprod")
    private Integer idinshasprod;
    @Column(name = "cantidad")
    private Long cantidad;
    @JoinColumn(name = "ihp_ins", referencedColumnName = "idinsumo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Insumos ihpIns;
    @JoinColumn(name = "ihp_prod", referencedColumnName = "idprod")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto ihpProd;

    public Insumoshasproductos() {
    }

    public Insumoshasproductos(Integer idinshasprod) {
        this.idinshasprod = idinshasprod;
    }

    public Integer getIdinshasprod() {
        return idinshasprod;
    }

    public void setIdinshasprod(Integer idinshasprod) {
        this.idinshasprod = idinshasprod;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Insumos getIhpIns() {
        return ihpIns;
    }

    public void setIhpIns(Insumos ihpIns) {
        this.ihpIns = ihpIns;
    }

    public Producto getIhpProd() {
        return ihpProd;
    }

    public void setIhpProd(Producto ihpProd) {
        this.ihpProd = ihpProd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinshasprod != null ? idinshasprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumoshasproductos)) {
            return false;
        }
        Insumoshasproductos other = (Insumoshasproductos) object;
        if ((this.idinshasprod == null && other.idinshasprod != null) || (this.idinshasprod != null && !this.idinshasprod.equals(other.idinshasprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Insumoshasproductos[ idinshasprod=" + idinshasprod + " ]";
    }
    
}
