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
 * SyGroupWarehouseUsers generated by hbm2java
 */
@Entity
@Table(name="SyGroupWarehouseUsers"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class SyGroupWarehouseUsers  implements java.io.Serializable {


     private String groupUserWarehouseId;
     private String warehouseId;
     private String contactPersonId;
     private String createdBy;
     private Date createdDate;

    public SyGroupWarehouseUsers() {
    }

	
    public SyGroupWarehouseUsers(String groupUserWarehouseId, String warehouseId, String contactPersonId) {
        this.groupUserWarehouseId = groupUserWarehouseId;
        this.warehouseId = warehouseId;
        this.contactPersonId = contactPersonId;
    }
    public SyGroupWarehouseUsers(String groupUserWarehouseId, String warehouseId, String contactPersonId, String createdBy, Date createdDate) {
       this.groupUserWarehouseId = groupUserWarehouseId;
       this.warehouseId = warehouseId;
       this.contactPersonId = contactPersonId;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
    }
   
     @Id 

    
    @Column(name="GroupUserWarehouseId", unique=true, nullable=false, length=36)
    public String getGroupUserWarehouseId() {
        return this.groupUserWarehouseId;
    }
    
    public void setGroupUserWarehouseId(String groupUserWarehouseId) {
        this.groupUserWarehouseId = groupUserWarehouseId;
    }

    
    @Column(name="WarehouseId", nullable=false, length=40)
    public String getWarehouseId() {
        return this.warehouseId;
    }
    
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    
    @Column(name="ContactPersonId", nullable=false, length=20)
    public String getContactPersonId() {
        return this.contactPersonId;
    }
    
    public void setContactPersonId(String contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    
    @Column(name="CreatedBy", length=20)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
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




}

