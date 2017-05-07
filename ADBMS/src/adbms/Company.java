/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "company", catalog = "blood_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findByName", query = "SELECT c FROM Company c WHERE c.name = :name"),
    @NamedQuery(name = "Company.findByLicence", query = "SELECT c FROM Company c WHERE c.licence = :licence"),
    @NamedQuery(name = "Company.findByOwner", query = "SELECT c FROM Company c WHERE c.owner = :owner")})
public class Company implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "LICENCE")
    private Integer licence;
    @Basic(optional = false)
    @Column(name = "OWNER")
    private String owner;

    public Company() {
    }

    public Company(Integer licence) {
        this.licence = licence;
    }

    public Company(Integer licence, String name, String owner) {
        this.licence = licence;
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getLicence() {
        return licence;
    }

    public void setLicence(Integer licence) {
        Integer oldLicence = this.licence;
        this.licence = licence;
        changeSupport.firePropertyChange("licence", oldLicence, licence);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        String oldOwner = this.owner;
        this.owner = owner;
        changeSupport.firePropertyChange("owner", oldOwner, owner);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (licence != null ? licence.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.licence == null && other.licence != null) || (this.licence != null && !this.licence.equals(other.licence))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return licence.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
