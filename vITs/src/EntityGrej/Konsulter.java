/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityGrej;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Matus
 */
@Entity
@Table(name = "Konsulter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Konsulter.findAll", query = "SELECT k FROM Konsulter k"),
    @NamedQuery(name = "Konsulter.findById", query = "SELECT k FROM Konsulter k WHERE k.id = :id"),
    @NamedQuery(name = "Konsulter.findByEmail", query = "SELECT k FROM Konsulter k WHERE k.email = :email"),
    @NamedQuery(name = "Konsulter.findByAnvandarnamn", query = "SELECT k FROM Konsulter k WHERE k.anvandarnamn = :anvandarnamn"),
    @NamedQuery(name = "Konsulter.findByLosenord", query = "SELECT k FROM Konsulter k WHERE k.losenord = :losenord"),
    @NamedQuery(name = "Konsulter.findByFornamn", query = "SELECT k FROM Konsulter k WHERE k.fornamn = :fornamn"),
    @NamedQuery(name = "Konsulter.findByEfternamn", query = "SELECT k FROM Konsulter k WHERE k.efternamn = :efternamn")})
public class Konsulter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Anvandarnamn")
    private String anvandarnamn;
    @Basic(optional = false)
    @Column(name = "Losenord")
    private String losenord;
    @Basic(optional = false)
    @Column(name = "Fornamn")
    private String fornamn;
    @Basic(optional = false)
    @Column(name = "Efternamn")
    private String efternamn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "konsultID")
    private Collection<Reseförskott> reseförskottCollection;

    public Konsulter() {
    }

    public Konsulter(Integer id) {
        this.id = id;
    }

    public Konsulter(Integer id, String email, String anvandarnamn, String losenord, String fornamn, String efternamn) {
        this.id = id;
        this.email = email;
        this.anvandarnamn = anvandarnamn;
        this.losenord = losenord;
        this.fornamn = fornamn;
        this.efternamn = efternamn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnvandarnamn() {
        return anvandarnamn;
    }

    public void setAnvandarnamn(String anvandarnamn) {
        this.anvandarnamn = anvandarnamn;
    }

    public String getLosenord() {
        return losenord;
    }

    public void setLosenord(String losenord) {
        this.losenord = losenord;
    }

    public String getFornamn() {
        return fornamn;
    }

    public void setFornamn(String fornamn) {
        this.fornamn = fornamn;
    }

    public String getEfternamn() {
        return efternamn;
    }

    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    @XmlTransient
    public Collection<Reseförskott> getReseförskottCollection() {
        return reseförskottCollection;
    }

    public void setReseförskottCollection(Collection<Reseförskott> reseförskottCollection) {
        this.reseförskottCollection = reseförskottCollection;
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
        if (!(object instanceof Konsulter)) {
            return false;
        }
        Konsulter other = (Konsulter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityGrej.Konsulter[ id=" + id + " ]";
    }
    
}
