/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "blood", catalog = "blood_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Blood.findAll", query = "SELECT b FROM Blood b"),
    @NamedQuery(name = "Blood.findByPacketId", query = "SELECT b FROM Blood b WHERE b.packetId = :packetId"),
    @NamedQuery(name = "Blood.findByBPrice", query = "SELECT b FROM Blood b WHERE b.bPrice = :bPrice"),
    @NamedQuery(name = "Blood.findByBDate", query = "SELECT b FROM Blood b WHERE b.bDate = :bDate"),
    @NamedQuery(name = "Blood.findByBranchId", query = "SELECT b FROM Blood b WHERE b.branchId = :branchId"),
    @NamedQuery(name = "Blood.findByDonorId", query = "SELECT b FROM Blood b WHERE b.donorId = :donorId")})
public class Blood implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PACKET_ID")
    private Integer packetId;
    @Basic(optional = false)
    @Lob
    @Column(name = "B_GRP")
    private String bGrp;
    @Basic(optional = false)
    @Column(name = "B_PRICE")
    private int bPrice;
    @Basic(optional = false)
    @Column(name = "B_DATE")
    @Temporal(TemporalType.DATE)
    private Date bDate;
    @Basic(optional = false)
    @Column(name = "BRANCH_ID")
    private int branchId;
    @Basic(optional = false)
    @Column(name = "DONOR_ID")
    private int donorId;

    public Blood() {
    }

    public Blood(Integer packetId) {
        this.packetId = packetId;
    }

    public Blood(Integer packetId, String bGrp, int bPrice, Date bDate, int branchId, int donorId) {
        this.packetId = packetId;
        this.bGrp = bGrp;
        this.bPrice = bPrice;
        this.bDate = bDate;
        this.branchId = branchId;
        this.donorId = donorId;
    }

    public Integer getPacketId() {
        return packetId;
    }

    public void setPacketId(Integer packetId) {
        Integer oldPacketId = this.packetId;
        this.packetId = packetId;
        changeSupport.firePropertyChange("packetId", oldPacketId, packetId);
    }

    public String getBGrp() {
        return bGrp;
    }

    public void setBGrp(String bGrp) {
        String oldBGrp = this.bGrp;
        this.bGrp = bGrp;
        changeSupport.firePropertyChange("BGrp", oldBGrp, bGrp);
    }

    public int getBPrice() {
        return bPrice;
    }

    public void setBPrice(int bPrice) {
        int oldBPrice = this.bPrice;
        this.bPrice = bPrice;
        changeSupport.firePropertyChange("BPrice", oldBPrice, bPrice);
    }

    public Date getBDate() {
        return bDate;
    }

    public void setBDate(Date bDate) {
        Date oldBDate = this.bDate;
        this.bDate = bDate;
        changeSupport.firePropertyChange("BDate", oldBDate, bDate);
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        int oldBranchId = this.branchId;
        this.branchId = branchId;
        changeSupport.firePropertyChange("branchId", oldBranchId, branchId);
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        int oldDonorId = this.donorId;
        this.donorId = donorId;
        changeSupport.firePropertyChange("donorId", oldDonorId, donorId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (packetId != null ? packetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blood)) {
            return false;
        }
        Blood other = (Blood) object;
        if ((this.packetId == null && other.packetId != null) || (this.packetId != null && !this.packetId.equals(other.packetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return packetId.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
