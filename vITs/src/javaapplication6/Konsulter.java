/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

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
@Table(name = "Konsulter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Konsulter.findAll", query = "SELECT k FROM Konsulter k"),
    @NamedQuery(name = "Konsulter.findByKid", query = "SELECT k FROM Konsulter k WHERE k.kid = :kid"),
    @NamedQuery(name = "Konsulter.findByAnvandarnamn", query = "SELECT k FROM Konsulter k WHERE k.anvandarnamn = :anvandarnamn"),
    @NamedQuery(name = "Konsulter.findByLosenord", query = "SELECT k FROM Konsulter k WHERE k.losenord = :losenord"),
    @NamedQuery(name = "Konsulter.findByFornamn", query = "SELECT k FROM Konsulter k WHERE k.fornamn = :fornamn"),
    @NamedQuery(name = "Konsulter.findByEfternamn", query = "SELECT k FROM Konsulter k WHERE k.efternamn = :efternamn")})
public class Konsulter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KID")
    private Integer kid;
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

    public Konsulter() {
    }

    public Konsulter(Integer kid) {
        this.kid = kid;
    }

    public Konsulter(Integer kid, String anvandarnamn, String losenord, String fornamn, String efternamn) {
        this.kid = kid;
        this.anvandarnamn = anvandarnamn;
        this.losenord = losenord;
        this.fornamn = fornamn;
        this.efternamn = efternamn;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kid != null ? kid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Konsulter)) {
            return false;
        }
        Konsulter other = (Konsulter) object;
        if ((this.kid == null && other.kid != null) || (this.kid != null && !this.kid.equals(other.kid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication6.Konsulter[ kid=" + kid + " ]";
    }
    
}
