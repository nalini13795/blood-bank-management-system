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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "hospital", catalog = "blood_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Hospital.findAll", query = "SELECT h FROM Hospital h"),
    @NamedQuery(name = "Hospital.findByHId", query = "SELECT h FROM Hospital h WHERE h.hId = :hId"),
    @NamedQuery(name = "Hospital.findByHLocation", query = "SELECT h FROM Hospital h WHERE h.hLocation = :hLocation"),
    @NamedQuery(name = "Hospital.findByHContactNo", query = "SELECT h FROM Hospital h WHERE h.hContactNo = :hContactNo"),
    @NamedQuery(name = "Hospital.findByHName", query = "SELECT h FROM Hospital h WHERE h.hName = :hName")})
public class Hospital implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "H_ID")
    private Integer hId;
    @Basic(optional = false)
    @Lob
    @Column(name = "H_EMAIL")
    private String hEmail;
    @Basic(optional = false)
    @Column(name = "H_LOCATION")
    private String hLocation;
    @Basic(optional = false)
    @Column(name = "H_CONTACT_NO")
    private int hContactNo;
    @Basic(optional = false)
    @Column(name = "H_NAME")
    private String hName;

    public Hospital() {
    }

    public Hospital(Integer hId) {
        this.hId = hId;
    }

    public Hospital(Integer hId, String hEmail, String hLocation, int hContactNo, String hName) {
        this.hId = hId;
        this.hEmail = hEmail;
        this.hLocation = hLocation;
        this.hContactNo = hContactNo;
        this.hName = hName;
    }

    public Integer getHId() {
        return hId;
    }

    public void setHId(Integer hId) {
        Integer oldHId = this.hId;
        this.hId = hId;
        changeSupport.firePropertyChange("HId", oldHId, hId);
    }

    public String getHEmail() {
        return hEmail;
    }

    public void setHEmail(String hEmail) {
        String oldHEmail = this.hEmail;
        this.hEmail = hEmail;
        changeSupport.firePropertyChange("HEmail", oldHEmail, hEmail);
    }

    public String getHLocation() {
        return hLocation;
    }

    public void setHLocation(String hLocation) {
        String oldHLocation = this.hLocation;
        this.hLocation = hLocation;
        changeSupport.firePropertyChange("HLocation", oldHLocation, hLocation);
    }

    public int getHContactNo() {
        return hContactNo;
    }

    public void setHContactNo(int hContactNo) {
        int oldHContactNo = this.hContactNo;
        this.hContactNo = hContactNo;
        changeSupport.firePropertyChange("HContactNo", oldHContactNo, hContactNo);
    }

    public String getHName() {
        return hName;
    }

    public void setHName(String hName) {
        String oldHName = this.hName;
        this.hName = hName;
        changeSupport.firePropertyChange("HName", oldHName, hName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hId != null ? hId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospital)) {
            return false;
        }
        Hospital other = (Hospital) object;
        if ((this.hId == null && other.hId != null) || (this.hId != null && !this.hId.equals(other.hId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return hId.toString() ;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
