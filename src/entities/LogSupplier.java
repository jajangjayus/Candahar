package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LogSupplier generated by hbm2java
 */
@Entity
@Table(name="LogSupplier"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class LogSupplier  implements java.io.Serializable {


     private String logSupplierId;
     private String productId;
     private String supplierName;
     private Boolean isExists;
     private Integer createdBy;
     private Date createdDate;
     private Set logMaterialGroups = new HashSet(0);
     private Set logInbounds = new HashSet(0);

    public LogSupplier() {
    }

	
    public LogSupplier(String logSupplierId, String productId) {
        this.logSupplierId = logSupplierId;
        this.productId = productId;
    }
    public LogSupplier(String logSupplierId, String productId, String supplierName, Boolean isExists, Integer createdBy, Date createdDate, Set logMaterialGroups, Set logInbounds) {
       this.logSupplierId = logSupplierId;
       this.productId = productId;
       this.supplierName = supplierName;
       this.isExists = isExists;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.logMaterialGroups = logMaterialGroups;
       this.logInbounds = logInbounds;
    }
   
     @Id 

    
    @Column(name="LogSupplierId", unique=true, nullable=false, length=40)
    public String getLogSupplierId() {
        return this.logSupplierId;
    }
    
    public void setLogSupplierId(String logSupplierId) {
        this.logSupplierId = logSupplierId;
    }

    
    @Column(name="ProductId", nullable=false, length=40)
    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    
    @Column(name="SupplierName", length=100)
    public String getSupplierName() {
        return this.supplierName;
    }
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    
    @Column(name="IsExists")
    public Boolean getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(Boolean isExists) {
        this.isExists = isExists;
    }

    
    @Column(name="CreatedBy")
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreatedDate", length=23)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="logSupplier")
    public Set getLogMaterialGroups() {
        return this.logMaterialGroups;
    }
    
    public void setLogMaterialGroups(Set logMaterialGroups) {
        this.logMaterialGroups = logMaterialGroups;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="logSupplier")
    public Set getLogInbounds() {
        return this.logInbounds;
    }
    
    public void setLogInbounds(Set logInbounds) {
        this.logInbounds = logInbounds;
    }




}


