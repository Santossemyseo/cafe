/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptp.cafesin.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Primero tu Pais
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idven")
    private Integer idven;
    @Column(name = "facturaVenta")
    private Integer facturaVenta;
    @Column(name = "valorTotalVenta")
    private Long valorTotalVenta;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @OneToMany(mappedBy = "ventaId", fetch = FetchType.LAZY)
    private List<Ventahasproducto> ventahasproductoList;
    @JoinColumn(name = "ven_cli_num", referencedColumnName = "idcliente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clientes venCliNum;
    @JoinColumn(name = "ven_cola_num", referencedColumnName = "idcol")
    @ManyToOne(fetch = FetchType.LAZY)
    private Colaboradores venColaNum;

    public Venta() {
    }

    public Venta(Integer idven) {
        this.idven = idven;
    }

    public Integer getIdven() {
        return idven;
    }

    public void setIdven(Integer idven) {
        this.idven = idven;
    }

    public Integer getFacturaVenta() {
        return facturaVenta;
    }

    public void setFacturaVenta(Integer facturaVenta) {
        this.facturaVenta = facturaVenta;
    }

    public Long getValorTotalVenta() {
        return valorTotalVenta;
    }

    public void setValorTotalVenta(Long valorTotalVenta) {
        this.valorTotalVenta = valorTotalVenta;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @XmlTransient
    public List<Ventahasproducto> getVentahasproductoList() {
        return ventahasproductoList;
    }

    public void setVentahasproductoList(List<Ventahasproducto> ventahasproductoList) {
        this.ventahasproductoList = ventahasproductoList;
    }

    public Clientes getVenCliNum() {
        return venCliNum;
    }

    public void setVenCliNum(Clientes venCliNum) {
        this.venCliNum = venCliNum;
    }

    public Colaboradores getVenColaNum() {
        return venColaNum;
    }

    public void setVenColaNum(Colaboradores venColaNum) {
        this.venColaNum = venColaNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idven != null ? idven.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idven == null && other.idven != null) || (this.idven != null && !this.idven.equals(other.idven))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Venta[ idven=" + idven + " ]";
    }
    
}
