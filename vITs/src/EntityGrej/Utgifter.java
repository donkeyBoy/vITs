/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityGrej;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matus
 */
@Entity
@Table(name = "Utgifter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utgifter.findAll", query = "SELECT u FROM Utgifter u"),
    @NamedQuery(name = "Utgifter.findById", query = "SELECT u FROM Utgifter u WHERE u.id = :id"),
    @NamedQuery(name = "Utgifter.findByTyp", query = "SELECT u FROM Utgifter u WHERE u.typ = :typ"),
    @NamedQuery(name = "Utgifter.findBySumma", query = "SELECT u FROM Utgifter u WHERE u.summa = :summa")})
public class Utgifter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Typ")
    private String typ;
    @Basic(optional = false)
    @Column(name = "Summa")
    private int summa;

    public Utgifter() {
    }

    public Utgifter(Integer id) {
        this.id = id;
    }

    public Utgifter(Integer id, String typ, int summa) {
        this.id = id;
        this.typ = typ;
        this.summa = summa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utgifter)) {
            return false;
        }
        Utgifter other = (Utgifter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityGrej.Utgifter[ id=" + id + " ]";
    }
    
}
