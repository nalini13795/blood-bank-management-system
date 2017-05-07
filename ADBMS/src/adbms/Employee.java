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
@Table(name = "employee", catalog = "blood_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByEId", query = "SELECT e FROM Employee e WHERE e.eId = :eId"),
    @NamedQuery(name = "Employee.findByESalary", query = "SELECT e FROM Employee e WHERE e.eSalary = :eSalary"),
    @NamedQuery(name = "Employee.findByEAddress", query = "SELECT e FROM Employee e WHERE e.eAddress = :eAddress"),
    @NamedQuery(name = "Employee.findByEDesig", query = "SELECT e FROM Employee e WHERE e.eDesig = :eDesig"),
    @NamedQuery(name = "Employee.findByEName", query = "SELECT e FROM Employee e WHERE e.eName = :eName"),
    @NamedQuery(name = "Employee.findByEMobileNo", query = "SELECT e FROM Employee e WHERE e.eMobileNo = :eMobileNo"),
    @NamedQuery(name = "Employee.findByBranchId", query = "SELECT e FROM Employee e WHERE e.branchId = :branchId")})
public class Employee implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "E_ID")
    private Integer eId;
    @Basic(optional = false)
    @Column(name = "E_SALARY")
    private int eSalary;
    @Basic(optional = false)
    @Column(name = "E_ADDRESS")
    private String eAddress;
    @Basic(optional = false)
    @Column(name = "E_DESIG")
    private String eDesig;
    @Basic(optional = false)
    @Column(name = "E_NAME")
    private String eName;
    @Basic(optional = false)
    @Column(name = "E_MOBILE_NO")
    private int eMobileNo;
    @Basic(optional = false)
    @Lob
    @Column(name = "E_EMAIL")
    private String eEmail;
    @Basic(optional = false)
    @Column(name = "BRANCH_ID")
    private int branchId;

    public Employee() {
    }

    public Employee(Integer eId) {
        this.eId = eId;
    }

    public Employee(Integer eId, int eSalary, String eAddress, String eDesig, String eName, int eMobileNo, String eEmail, int branchId) {
        this.eId = eId;
        this.eSalary = eSalary;
        this.eAddress = eAddress;
        this.eDesig = eDesig;
        this.eName = eName;
        this.eMobileNo = eMobileNo;
        this.eEmail = eEmail;
        this.branchId = branchId;
    }

    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        Integer oldEId = this.eId;
        this.eId = eId;
        changeSupport.firePropertyChange("EId", oldEId, eId);
    }

    public int getESalary() {
        return eSalary;
    }

    public void setESalary(int eSalary) {
        int oldESalary = this.eSalary;
        this.eSalary = eSalary;
        changeSupport.firePropertyChange("ESalary", oldESalary, eSalary);
    }

    public String getEAddress() {
        return eAddress;
    }

    public void setEAddress(String eAddress) {
        String oldEAddress = this.eAddress;
        this.eAddress = eAddress;
        changeSupport.firePropertyChange("EAddress", oldEAddress, eAddress);
    }

    public String getEDesig() {
        return eDesig;
    }

    public void setEDesig(String eDesig) {
        String oldEDesig = this.eDesig;
        this.eDesig = eDesig;
        changeSupport.firePropertyChange("EDesig", oldEDesig, eDesig);
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        String oldEName = this.eName;
        this.eName = eName;
        changeSupport.firePropertyChange("EName", oldEName, eName);
    }

    public int getEMobileNo() {
        return eMobileNo;
    }

    public void setEMobileNo(int eMobileNo) {
        int oldEMobileNo = this.eMobileNo;
        this.eMobileNo = eMobileNo;
        changeSupport.firePropertyChange("EMobileNo", oldEMobileNo, eMobileNo);
    }

    public String getEEmail() {
        return eEmail;
    }

    public void setEEmail(String eEmail) {
        String oldEEmail = this.eEmail;
        this.eEmail = eEmail;
        changeSupport.firePropertyChange("EEmail", oldEEmail, eEmail);
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
        hash += (eId != null ? eId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.eId == null && other.eId != null) || (this.eId != null && !this.eId.equals(other.eId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adbms.Employee[ eId=" + eId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
