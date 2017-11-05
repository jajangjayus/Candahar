package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LoDeliveryOrderSiteId generated by hbm2java
 */
@Entity
@Table(name="LoDeliveryOrderSiteId"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class LoDeliveryOrderSiteId  implements java.io.Serializable {


     private String loDeliveryOrderSiteId;
     private TransactionHeader transactionHeader;
     private String fromSlboqid;
     private String toSlboqid;
     private String companyId;
     private Integer stepCount;
     private Boolean isExists;

    public LoDeliveryOrderSiteId() {
    }

	
    public LoDeliveryOrderSiteId(String loDeliveryOrderSiteId, TransactionHeader transactionHeader) {
        this.loDeliveryOrderSiteId = loDeliveryOrderSiteId;
        this.transactionHeader = transactionHeader;
    }
    public LoDeliveryOrderSiteId(String loDeliveryOrderSiteId, TransactionHeader transactionHeader, String fromSlboqid, String toSlboqid, String companyId, Integer stepCount, Boolean isExists) {
       this.loDeliveryOrderSiteId = loDeliveryOrderSiteId;
       this.transactionHeader = transactionHeader;
       this.fromSlboqid = fromSlboqid;
       this.toSlboqid = toSlboqid;
       this.companyId = companyId;
       this.stepCount = stepCount;
       this.isExists = isExists;
    }
   
     @Id 

    
    @Column(name="LoDeliveryOrderSiteId", unique=true, nullable=false, length=40)
    public String getLoDeliveryOrderSiteId() {
        return this.loDeliveryOrderSiteId;
    }
    
    public void setLoDeliveryOrderSiteId(String loDeliveryOrderSiteId) {
        this.loDeliveryOrderSiteId = loDeliveryOrderSiteId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MainFormId", nullable=false)
    public TransactionHeader getTransactionHeader() {
        return this.transactionHeader;
    }
    
    public void setTransactionHeader(TransactionHeader transactionHeader) {
        this.transactionHeader = transactionHeader;
    }

    
    @Column(name="FromSLBOQId", length=36)
    public String getFromSlboqid() {
        return this.fromSlboqid;
    }
    
    public void setFromSlboqid(String fromSlboqid) {
        this.fromSlboqid = fromSlboqid;
    }

    
    @Column(name="ToSLBOQId", length=36)
    public String getToSlboqid() {
        return this.toSlboqid;
    }
    
    public void setToSlboqid(String toSlboqid) {
        this.toSlboqid = toSlboqid;
    }

    
    @Column(name="CompanyId", length=15)
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    
    @Column(name="StepCount")
    public Integer getStepCount() {
        return this.stepCount;
    }
    
    public void setStepCount(Integer stepCount) {
        this.stepCount = stepCount;
    }

    
    @Column(name="IsExists")
    public Boolean getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(Boolean isExists) {
        this.isExists = isExists;
    }




}


