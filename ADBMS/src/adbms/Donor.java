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
@Table(name = "donor", catalog = "blood_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Donor.findAll", query = "SELECT d FROM Donor d"),
    @NamedQuery(name = "Donor.findByDonorId", query = "SELECT d FROM Donor d WHERE d.donorId = :donorId"),
    @NamedQuery(name = "Donor.findByAddress", query = "SELECT d FROM Donor d WHERE d.address = :address"),
    @NamedQuery(name = "Donor.findByBloodGrp", query = "SELECT d FROM Donor d WHERE d.bloodGrp = :bloodGrp"),
    @NamedQuery(name = "Donor.findByAge", query = "SELECT d FROM Donor d WHERE d.age = :age"),
    @NamedQuery(name = "Donor.findByMobileNo", query = "SELECT d FROM Donor d WHERE d.mobileNo = :mobileNo"),
    @NamedQuery(name = "Donor.findByName", query = "SELECT d FROM Donor d WHERE d.name = :name"),
    @NamedQuery(name = "Donor.findByPacketId", query = "SELECT d FROM Donor d WHERE d.packetId = :packetId"),
    @NamedQuery(name = "Donor.findByBranchId", query = "SELECT d FROM Donor d WHERE d.branchId = :branchId")})
public class Donor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DONOR_ID")
    private Integer donorId;
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @Column(name = "BLOOD_GRP")
    private String bloodGrp;
    @Basic(optional = false)
    @Lob
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "AGE")
    private int age;
    @Basic(optional = false)
    @Column(name = "MOBILE_NO")
    private int mobileNo;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "PACKET_ID")
    private int packetId;
    @Basic(optional = false)
    @Column(name = "BRANCH_ID")
    private int branchId;

    public Donor() {
    }

    public Donor(Integer donorId) {
        this.donorId = donorId;
    }

    public Donor(Integer donorId, String address, String bloodGrp, String email, int age, int mobileNo, String name, int packetId, int branchId) {
        this.donorId = donorId;
        this.address = address;
        this.bloodGrp = bloodGrp;
        this.email = email;
        this.age = age;
        this.mobileNo = mobileNo;
        this.name = name;
        this.packetId = packetId;
        this.branchId = branchId;
    }

    public Integer getDonorId() {
        return donorId;
    }

    public void setDonorId(Integer donorId) {
        Integer oldDonorId = this.donorId;
        this.donorId = donorId;
        changeSupport.firePropertyChange("donorId", oldDonorId, donorId);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        String oldBloodGrp = this.bloodGrp;
        this.bloodGrp = bloodGrp;
        changeSupport.firePropertyChange("bloodGrp", oldBloodGrp, bloodGrp);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        int oldMobileNo = this.mobileNo;
        this.mobileNo = mobileNo;
        changeSupport.firePropertyChange("mobileNo", oldMobileNo, mobileNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public int getPacketId() {
        return packetId;
    }

    public void setPacketId(int packetId) {
        int oldPacketId = this.packetId;
        this.packetId = packetId;
        changeSupport.firePropertyChange("packetId", oldPacketId, packetId);
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        int oldBranchId = this.branchId;
        this.branchId = branchId;
        changeSupport.firePropertyChange("branchId", oldBranchId, branchId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (donorId != null ? donorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donor)) {
            return false;
        }
        Donor other = (Donor) object;
        if ((this.donorId == null && other.donorId != null) || (this.donorId != null && !this.donorId.equals(other.donorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  donorId.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
