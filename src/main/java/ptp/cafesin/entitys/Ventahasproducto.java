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
@Table(name = "ventahasproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventahasproducto.findAll", query = "SELECT v FROM Ventahasproducto v")})
public class Ventahasproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvhp")
    private Integer idvhp;
    @Column(name = "cantidad")
    private Long cantidad;
    @JoinColumn(name = "produc_id", referencedColumnName = "idprod")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producId;
    @JoinColumn(name = "venta_id", referencedColumnName = "idven")
    @ManyToOne(fetch = FetchType.LAZY)
    private Venta ventaId;

    public Ventahasproducto() {
    }

    public Ventahasproducto(Integer idvhp) {
        this.idvhp = idvhp;
    }

    public Integer getIdvhp() {
        return idvhp;
    }

    public void setIdvhp(Integer idvhp) {
        this.idvhp = idvhp;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducId() {
        return producId;
    }

    public void setProducId(Producto producId) {
        this.producId = producId;
    }

    public Venta getVentaId() {
        return ventaId;
    }

    public void setVentaId(Venta ventaId) {
        this.ventaId = ventaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvhp != null ? idvhp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventahasproducto)) {
            return false;
        }
        Ventahasproducto other = (Ventahasproducto) object;
        if ((this.idvhp == null && other.idvhp != null) || (this.idvhp != null && !this.idvhp.equals(other.idvhp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Ventahasproducto[ idvhp=" + idvhp + " ]";
    }
    
}
