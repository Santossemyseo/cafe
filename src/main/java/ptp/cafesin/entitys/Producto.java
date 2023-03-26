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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Primero tu Pais
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprod")
    private Integer idprod;
    @Column(name = "codProducto")
    private Integer codProducto;
    @Size(max = 45)
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Size(max = 500)
    @Column(name = "descripcionProducto")
    private String descripcionProducto;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "valorProducto")
    private Long valorProducto;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @OneToMany(mappedBy = "producId", fetch = FetchType.LAZY)
    private List<Ventahasproducto> ventahasproductoList;
    @JoinColumn(name = "prod_cat_id", referencedColumnName = "idcategoria")
    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria prodCatId;
    @OneToMany(mappedBy = "ihpProd", fetch = FetchType.LAZY)
    private List<Insumoshasproductos> insumoshasproductosList;

    public Producto() {
    }

    public Producto(Integer idprod) {
        this.idprod = idprod;
    }

    public Integer getIdprod() {
        return idprod;
    }

    public void setIdprod(Integer idprod) {
        this.idprod = idprod;
    }

    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(Long valorProducto) {
        this.valorProducto = valorProducto;
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

    public Categoria getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(Categoria prodCatId) {
        this.prodCatId = prodCatId;
    }

    @XmlTransient
    public List<Insumoshasproductos> getInsumoshasproductosList() {
        return insumoshasproductosList;
    }

    public void setInsumoshasproductosList(List<Insumoshasproductos> insumoshasproductosList) {
        this.insumoshasproductosList = insumoshasproductosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprod != null ? idprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idprod == null && other.idprod != null) || (this.idprod != null && !this.idprod.equals(other.idprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Producto[ idprod=" + idprod + " ]";
    }
    
}
