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
@Table(name = "colaboradores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colaboradores.findAll", query = "SELECT c FROM Colaboradores c")})
public class Colaboradores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcol")
    private Integer idcol;
    @Size(max = 5)
    @Column(name = "tipoDoc")
    private String tipoDoc;
    @Column(name = "numDoc")
    private Long numDoc;
    @Size(max = 45)
    @Column(name = "nombreColaborador")
    private String nombreColaborador;
    @Size(max = 45)
    @Column(name = "apellidoColaborador")
    private String apellidoColaborador;
    @Size(max = 20)
    @Column(name = "telefonoColaborador")
    private String telefonoColaborador;
    @Size(max = 45)
    @Column(name = "emailColaborador")
    private String emailColaborador;
    @Size(max = 100)
    @Column(name = "password")
    private String password;
    @Size(max = 100)
    @Column(name = "confirmarPassword")
    private String confirmarPassword;
    @Column(name = "fechaTurno")
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    @JoinColumn(name = "us_rol_id", referencedColumnName = "idrol")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rol usRolId;
    @JoinColumn(name = "us_turn_id", referencedColumnName = "idTurno")
    @ManyToOne(fetch = FetchType.LAZY)
    private Turnos usTurnId;
    @OneToMany(mappedBy = "venColaNum", fetch = FetchType.LAZY)
    private List<Venta> ventaList;

    public Colaboradores() {
    }

    public Colaboradores(Integer idcol) {
        this.idcol = idcol;
    }

    public Integer getIdcol() {
        return idcol;
    }

    public void setIdcol(Integer idcol) {
        this.idcol = idcol;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombreColaborador() {
        return nombreColaborador;
    }

    public void setNombreColaborador(String nombreColaborador) {
        this.nombreColaborador = nombreColaborador;
    }

    public String getApellidoColaborador() {
        return apellidoColaborador;
    }

    public void setApellidoColaborador(String apellidoColaborador) {
        this.apellidoColaborador = apellidoColaborador;
    }

    public String getTelefonoColaborador() {
        return telefonoColaborador;
    }

    public void setTelefonoColaborador(String telefonoColaborador) {
        this.telefonoColaborador = telefonoColaborador;
    }

    public String getEmailColaborador() {
        return emailColaborador;
    }

    public void setEmailColaborador(String emailColaborador) {
        this.emailColaborador = emailColaborador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmarPassword() {
        return confirmarPassword;
    }

    public void setConfirmarPassword(String confirmarPassword) {
        this.confirmarPassword = confirmarPassword;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
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

    public Rol getUsRolId() {
        return usRolId;
    }

    public void setUsRolId(Rol usRolId) {
        this.usRolId = usRolId;
    }

    public Turnos getUsTurnId() {
        return usTurnId;
    }

    public void setUsTurnId(Turnos usTurnId) {
        this.usTurnId = usTurnId;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcol != null ? idcol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colaboradores)) {
            return false;
        }
        Colaboradores other = (Colaboradores) object;
        if ((this.idcol == null && other.idcol != null) || (this.idcol != null && !this.idcol.equals(other.idcol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Colaboradores[ idcol=" + idcol + " ]";
    }
    
}
