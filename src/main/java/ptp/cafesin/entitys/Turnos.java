/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptp.cafesin.entitys;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Primero tu Pais
 */
@Entity
@Table(name = "turnos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turnos.findAll", query = "SELECT t FROM Turnos t")})
public class Turnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTurno")
    private Integer idTurno;
    @Size(max = 15)
    @Column(name = "nombreTurno")
    private String nombreTurno;
    @Size(max = 45)
    @Column(name = "descripcionTurno")
    private String descripcionTurno;
    @OneToMany(mappedBy = "usTurnId", fetch = FetchType.LAZY)
    private List<Colaboradores> colaboradoresList;

    public Turnos() {
    }

    public Turnos(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }

    public String getDescripcionTurno() {
        return descripcionTurno;
    }

    public void setDescripcionTurno(String descripcionTurno) {
        this.descripcionTurno = descripcionTurno;
    }

    @XmlTransient
    public List<Colaboradores> getColaboradoresList() {
        return colaboradoresList;
    }

    public void setColaboradoresList(List<Colaboradores> colaboradoresList) {
        this.colaboradoresList = colaboradoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTurno != null ? idTurno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turnos)) {
            return false;
        }
        Turnos other = (Turnos) object;
        if ((this.idTurno == null && other.idTurno != null) || (this.idTurno != null && !this.idTurno.equals(other.idTurno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ptp.cafesin.entitys.Turnos[ idTurno=" + idTurno + " ]";
    }
    
}
