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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matus
 */
@Entity
@Table(name = "Resef\u00f6rskott")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resef\u00f6rskott.findAll", query = "SELECT r FROM Resef\u00f6rskott r"),
    @NamedQuery(name = "Resef\u00f6rskott.findById", query = "SELECT r FROM Resef\u00f6rskott r WHERE r.id = :id"),
    @NamedQuery(name = "Resef\u00f6rskott.findByMotivering", query = "SELECT r FROM Resef\u00f6rskott r WHERE r.motivering = :motivering"),
    @NamedQuery(name = "Resef\u00f6rskott.findBySumma", query = "SELECT r FROM Resef\u00f6rskott r WHERE r.summa = :summa"),
    @NamedQuery(name = "Resef\u00f6rskott.findByAccepterat", query = "SELECT r FROM Resef\u00f6rskott r WHERE r.accepterat = :accepterat")})
public class Reseförskott implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Motivering")
    private String motivering;
    @Basic(optional = false)
    @Column(name = "Summa")
    private int summa;
    @Basic(optional = false)
    @Column(name = "Accepterat")
    private boolean accepterat;
    @JoinColumn(name = "Reseutl\u00e4ggsID", referencedColumnName = "ID")
    @ManyToOne
    private Reseutlägg reseutläggsID;
    @JoinColumn(name = "KonsultID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Konsulter konsultID;

    public Reseförskott() {
    }

    public Reseförskott(Integer id) {
        this.id = id;
    }

    public Reseförskott(Integer id, String motivering, int summa, boolean accepterat) {
        this.id = id;
        this.motivering = motivering;
        this.summa = summa;
        this.accepterat = accepterat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMotivering() {
        return motivering;
    }

    public void setMotivering(String motivering) {
        this.motivering = motivering;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public boolean getAccepterat() {
        return accepterat;
    }

    public void setAccepterat(boolean accepterat) {
        this.accepterat = accepterat;
    }

    public Reseutlägg getReseutläggsID() {
        return reseutläggsID;
    }

    public void setReseutläggsID(Reseutlägg reseutläggsID) {
        this.reseutläggsID = reseutläggsID;
    }

    public Konsulter getKonsultID() {
        return konsultID;
    }

    public void setKonsultID(Konsulter konsultID) {
        this.konsultID = konsultID;
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
        if (!(object instanceof Reseförskott)) {
            return false;
        }
        Reseförskott other = (Reseförskott) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityGrej.Resef\u00f6rskott[ id=" + id + " ]";
    }
    
}
