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
@Table(name = "branch", catalog = "blood_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Branch.findAll", query = "SELECT b FROM Branch b"),
    @NamedQuery(name = "Branch.findByBranchId", query = "SELECT b FROM Branch b WHERE b.branchId = :branchId"),
    @NamedQuery(name = "Branch.findByBLocation", query = "SELECT b FROM Branch b WHERE b.bLocation = :bLocation"),
    @NamedQuery(name = "Branch.findByBPhone", query = "SELECT b FROM Branch b WHERE b.bPhone = :bPhone"),
    @NamedQuery(name = "Branch.findByBHead", query = "SELECT b FROM Branch b WHERE b.bHead = :bHead"),
    @NamedQuery(name = "Branch.findByLicense", query = "SELECT b FROM Branch b WHERE b.license = :license")})
public class Branch implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BRANCH_ID")
    private Integer branchId;
    @Basic(optional = false)
    @Column(name = "B_LOCATION")
    private String bLocation;
    @Basic(optional = false)
    @Lob
    @Column(name = "B_EMAIL")
    private String bEmail;
    @Basic(optional = false)
    @Column(name = "B_PHONE")
    private int bPhone;
    @Basic(optional = false)
    @Column(name = "B_HEAD")
    private String bHead;
    @Basic(optional = false)
    @Column(name = "LICENSE")
    private int license;

    public Branch() {
    }

    public Branch(Integer branchId) {
        this.branchId = branchId;
    }

    public Branch(Integer branchId, String bLocation, String bEmail, int bPhone, String bHead, int license) {
        this.branchId = branchId;
        this.bLocation = bLocation;
        this.bEmail = bEmail;
        this.bPhone = bPhone;
        this.bHead = bHead;
        this.license = license;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        Integer oldBranchId = this.branchId;
        this.branchId = branchId;
        changeSupport.firePropertyChange("branchId", oldBranchId, branchId);
    }

    public String getBLocation() {
        return bLocation;
    }

    public void setBLocation(String bLocation) {
        String oldBLocation = this.bLocation;
        this.bLocation = bLocation;
        changeSupport.firePropertyChange("BLocation", oldBLocation, bLocation);
    }

    public String getBEmail() {
        return bEmail;
    }

    public void setBEmail(String bEmail) {
        String oldBEmail = this.bEmail;
        this.bEmail = bEmail;
        changeSupport.firePropertyChange("BEmail", oldBEmail, bEmail);
    }

    public int getBPhone() {
        return bPhone;
    }

    public void setBPhone(int bPhone) {
        int oldBPhone = this.bPhone;
        this.bPhone = bPhone;
        changeSupport.firePropertyChange("BPhone", oldBPhone, bPhone);
    }

    public String getBHead() {
        return bHead;
    }

    public void setBHead(String bHead) {
        String oldBHead = this.bHead;
        this.bHead = bHead;
        changeSupport.firePropertyChange("BHead", oldBHead, bHead);
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        int oldLicense = this.license;
        this.license = license;
        changeSupport.firePropertyChange("license", oldLicense, license);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (branchId != null ? branchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Branch)) {
            return false;
        }
        Branch other = (Branch) object;
        if ((this.branchId == null && other.branchId != null) || (this.branchId != null && !this.branchId.equals(other.branchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  branchId.toString() ;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
