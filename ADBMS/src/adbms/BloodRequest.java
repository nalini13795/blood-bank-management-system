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
@Table(name = "blood_request", catalog = "blood_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "BloodRequest.findAll", query = "SELECT b FROM BloodRequest b"),
    @NamedQuery(name = "BloodRequest.findByPName", query = "SELECT b FROM BloodRequest b WHERE b.pName = :pName"),
    @NamedQuery(name = "BloodRequest.findByQuantitiy", query = "SELECT b FROM BloodRequest b WHERE b.quantitiy = :quantitiy"),
    @NamedQuery(name = "BloodRequest.findByHId", query = "SELECT b FROM BloodRequest b WHERE b.hId = :hId"),
    @NamedQuery(name = "BloodRequest.findByBranchId", query = "SELECT b FROM BloodRequest b WHERE b.branchId = :branchId"),
    @NamedQuery(name = "BloodRequest.findById", query = "SELECT b FROM BloodRequest b WHERE b.id = :id")})
public class BloodRequest implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "P_NAME")
    private String pName;
    @Basic(optional = false)
    @Lob
    @Column(name = "P_GRP")
    private String pGrp;
    @Basic(optional = false)
    @Column(name = "QUANTITIY")
    private int quantitiy;
    @Basic(optional = false)
    @Column(name = "H_ID")
    private int hId;
    @Basic(optional = false)
    @Column(name = "BRANCH_ID")
    private int branchId;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    public BloodRequest() {
    }

    public BloodRequest(Integer id) {
        this.id = id;
    }

    public BloodRequest(Integer id, String pName, String pGrp, int quantitiy, int hId, int branchId) {
        this.id = id;
        this.pName = pName;
        this.pGrp = pGrp;
        this.quantitiy = quantitiy;
        this.hId = hId;
        this.branchId = branchId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        String oldPName = this.pName;
        this.pName = pName;
        changeSupport.firePropertyChange("PName", oldPName, pName);
    }

    public String getPGrp() {
        return pGrp;
    }

    public void setPGrp(String pGrp) {
        String oldPGrp = this.pGrp;
        this.pGrp = pGrp;
        changeSupport.firePropertyChange("PGrp", oldPGrp, pGrp);
    }

    public int getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(int quantitiy) {
        int oldQuantitiy = this.quantitiy;
        this.quantitiy = quantitiy;
        changeSupport.firePropertyChange("quantitiy", oldQuantitiy, quantitiy);
    }

    public int getHId() {
        return hId;
    }

    public void setHId(int hId) {
        int oldHId = this.hId;
        this.hId = hId;
        changeSupport.firePropertyChange("HId", oldHId, hId);
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        int oldBranchId = this.branchId;
        this.branchId = branchId;
        changeSupport.firePropertyChange("branchId", oldBranchId, branchId);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
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
        if (!(object instanceof BloodRequest)) {
            return false;
        }
        BloodRequest other = (BloodRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adbms.BloodRequest[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
