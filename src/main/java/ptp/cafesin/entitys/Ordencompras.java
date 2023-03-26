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
@Table(name = "ordencompras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordencompras.findAll", query = "SELECT o FROM Ordencompras o")})
public class Ordencompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfact")
    private Integer idfact;
    @Column(name = "facturaCompra")
    private Integer facturaCompra;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "valorTotal")
    private Long valorTotal;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @OneToMany(mappedBy = "insOrdcom", fetch = FetchType.LAZY)
    private List<Insumos> insumosList;
    @JoinColumn(name = "ordcom_idprov", referencedColumnName = "idprov")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedor ordcomIdprov;

    public Ordencompras() {
    }

    public Ordencompras(Integer idfact) {
        this.idfact = idfact;
    }

    public Integer getIdfact() {
        return idfact;
    }

    public void setIdfact(Integer idfact) {
        this.idfact = idfact;
    }

    public Integer getFacturaCompra() {
        return facturaCompra;
    }

    public void setFacturaCompra(Integer facturaCompra) {
        this.facturaCompra = facturaCompra;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
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
    public List<Insumos> getInsumosList() {
        return insumosList;
    }

    public void setInsumosList(List<Insumos> insumosList) {
        this.insumosList = insumosList;
    }

    public Proveedor getOrdcomIdprov() {
        return ordcomIdprov;
    }

    public void setOrdcomIdprov(Proveedor ordcomIdprov) {
        this.ordcomIdprov = ordcomIdprov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfact != null ? idfact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordencompras)) {
            return false;
        }
        Ordencompras other = (Ordencompras) object;
        if ((this.idfact == null && other.idfact != null) || (this.idfact != null && !this.idfact.equals(other.idfact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Ordencompras[ idfact=" + idfact + " ]";
    }
    
}
