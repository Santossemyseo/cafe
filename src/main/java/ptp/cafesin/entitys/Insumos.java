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
@Table(name = "insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumos.findAll", query = "SELECT i FROM Insumos i")})
public class Insumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinsumo")
    private Integer idinsumo;
    @Column(name = "codInsumos")
    private Integer codInsumos;
    @Size(max = 300)
    @Column(name = "nombreInsumo")
    private String nombreInsumo;
    @Column(name = "cantidadstock")
    private Long cantidadstock;
    @Column(name = "valorInsumo")
    private Long valorInsumo;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @JoinColumn(name = "ins_cat_cod", referencedColumnName = "idcategoria")
    @ManyToOne(fetch = FetchType.LAZY)
    private Categoria insCatCod;
    @JoinColumn(name = "ins_ordcom", referencedColumnName = "idfact")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ordencompras insOrdcom;
    @OneToMany(mappedBy = "ihpIns", fetch = FetchType.LAZY)
    private List<Insumoshasproductos> insumoshasproductosList;

    public Insumos() {
    }

    public Insumos(Integer idinsumo) {
        this.idinsumo = idinsumo;
    }

    public Integer getIdinsumo() {
        return idinsumo;
    }

    public void setIdinsumo(Integer idinsumo) {
        this.idinsumo = idinsumo;
    }

    public Integer getCodInsumos() {
        return codInsumos;
    }

    public void setCodInsumos(Integer codInsumos) {
        this.codInsumos = codInsumos;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public Long getCantidadstock() {
        return cantidadstock;
    }

    public void setCantidadstock(Long cantidadstock) {
        this.cantidadstock = cantidadstock;
    }

    public Long getValorInsumo() {
        return valorInsumo;
    }

    public void setValorInsumo(Long valorInsumo) {
        this.valorInsumo = valorInsumo;
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

    public Categoria getInsCatCod() {
        return insCatCod;
    }

    public void setInsCatCod(Categoria insCatCod) {
        this.insCatCod = insCatCod;
    }

    public Ordencompras getInsOrdcom() {
        return insOrdcom;
    }

    public void setInsOrdcom(Ordencompras insOrdcom) {
        this.insOrdcom = insOrdcom;
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
        hash += (idinsumo != null ? idinsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumos)) {
            return false;
        }
        Insumos other = (Insumos) object;
        if ((this.idinsumo == null && other.idinsumo != null) || (this.idinsumo != null && !this.idinsumo.equals(other.idinsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Insumos[ idinsumo=" + idinsumo + " ]";
    }
    
}
