package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LoMaterialTrackingHistory generated by hbm2java
 */
@Entity
@Table(name="LoMaterialTrackingHistory"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class LoMaterialTrackingHistory  implements java.io.Serializable {


     private String materialTrackingHistoryId;
     private String parentDetailId;
     private Date trackingDate;
     private String trackFlag;
     private String mainFormId;
     private String mainFormType;
     private String warehouseId;
     private String materialSerialNumber;
     private String conditionId;
     private Date createdDate;

    public LoMaterialTrackingHistory() {
    }

	
    public LoMaterialTrackingHistory(String materialTrackingHistoryId) {
        this.materialTrackingHistoryId = materialTrackingHistoryId;
    }
    public LoMaterialTrackingHistory(String materialTrackingHistoryId, String parentDetailId, Date trackingDate, String trackFlag, String mainFormId, String mainFormType, String warehouseId, String materialSerialNumber, String conditionId, Date createdDate) {
       this.materialTrackingHistoryId = materialTrackingHistoryId;
       this.parentDetailId = parentDetailId;
       this.trackingDate = trackingDate;
       this.trackFlag = trackFlag;
       this.mainFormId = mainFormId;
       this.mainFormType = mainFormType;
       this.warehouseId = warehouseId;
       this.materialSerialNumber = materialSerialNumber;
       this.conditionId = conditionId;
       this.createdDate = createdDate;
    }
   
     @Id 

    
    @Column(name="MaterialTrackingHistoryId", unique=true, nullable=false, length=40)
    public String getMaterialTrackingHistoryId() {
        return this.materialTrackingHistoryId;
    }
    
    public void setMaterialTrackingHistoryId(String materialTrackingHistoryId) {
        this.materialTrackingHistoryId = materialTrackingHistoryId;
    }

    
    @Column(name="ParentDetailId", length=40)
    public String getParentDetailId() {
        return this.parentDetailId;
    }
    
    public void setParentDetailId(String parentDetailId) {
        this.parentDetailId = parentDetailId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TrackingDate", length=23)
    public Date getTrackingDate() {
        return this.trackingDate;
    }
    
    public void setTrackingDate(Date trackingDate) {
        this.trackingDate = trackingDate;
    }

    
    @Column(name="TrackFlag", length=40)
    public String getTrackFlag() {
        return this.trackFlag;
    }
    
    public void setTrackFlag(String trackFlag) {
        this.trackFlag = trackFlag;
    }

    
    @Column(name="MainFormId", length=40)
    public String getMainFormId() {
        return this.mainFormId;
    }
    
    public void setMainFormId(String mainFormId) {
        this.mainFormId = mainFormId;
    }

    
    @Column(name="MainFormType", length=40)
    public String getMainFormType() {
        return this.mainFormType;
    }
    
    public void setMainFormType(String mainFormType) {
        this.mainFormType = mainFormType;
    }

    
    @Column(name="WarehouseId", length=40)
    public String getWarehouseId() {
        return this.warehouseId;
    }
    
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    
    @Column(name="MaterialSerialNumber", length=40)
    public String getMaterialSerialNumber() {
        return this.materialSerialNumber;
    }
    
    public void setMaterialSerialNumber(String materialSerialNumber) {
        this.materialSerialNumber = materialSerialNumber;
    }

    
    @Column(name="ConditionId", length=40)
    public String getConditionId() {
        return this.conditionId;
    }
    
    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreatedDate", length=23)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }




}


