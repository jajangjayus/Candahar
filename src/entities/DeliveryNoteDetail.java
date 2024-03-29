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
 * DeliveryNoteDetail generated by hbm2java
 */
@Entity
@Table(name="DeliveryNoteDetail"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class DeliveryNoteDetail  implements java.io.Serializable {


     private String deliveryNoteDetailId;
     private String deliveryNoteId;
     private String deliveryRequestDetailId;
     private String deliveryRequestId;
     private String materialSerialNumber;
     private String parentSerialNumber;
     private Date eventDate;
     private String eventStatusId;
     private String planSlboqid;
     private String planRegionId;
     private String planAreaId;
     private String planSiteId;
     private String actualSlboqid;
     private String actualRegionId;
     private String actualAreaId;
     private String actualSiteId;
     private Boolean isReceived;
     private Integer createdBy;
     private Date createdDate;

    public DeliveryNoteDetail() {
    }

	
    public DeliveryNoteDetail(String deliveryNoteDetailId, String deliveryNoteId, String deliveryRequestDetailId, String deliveryRequestId, String materialSerialNumber) {
        this.deliveryNoteDetailId = deliveryNoteDetailId;
        this.deliveryNoteId = deliveryNoteId;
        this.deliveryRequestDetailId = deliveryRequestDetailId;
        this.deliveryRequestId = deliveryRequestId;
        this.materialSerialNumber = materialSerialNumber;
    }
    public DeliveryNoteDetail(String deliveryNoteDetailId, String deliveryNoteId, String deliveryRequestDetailId, String deliveryRequestId, String materialSerialNumber, String parentSerialNumber, Date eventDate, String eventStatusId, String planSlboqid, String planRegionId, String planAreaId, String planSiteId, String actualSlboqid, String actualRegionId, String actualAreaId, String actualSiteId, Boolean isReceived, Integer createdBy, Date createdDate) {
       this.deliveryNoteDetailId = deliveryNoteDetailId;
       this.deliveryNoteId = deliveryNoteId;
       this.deliveryRequestDetailId = deliveryRequestDetailId;
       this.deliveryRequestId = deliveryRequestId;
       this.materialSerialNumber = materialSerialNumber;
       this.parentSerialNumber = parentSerialNumber;
       this.eventDate = eventDate;
       this.eventStatusId = eventStatusId;
       this.planSlboqid = planSlboqid;
       this.planRegionId = planRegionId;
       this.planAreaId = planAreaId;
       this.planSiteId = planSiteId;
       this.actualSlboqid = actualSlboqid;
       this.actualRegionId = actualRegionId;
       this.actualAreaId = actualAreaId;
       this.actualSiteId = actualSiteId;
       this.isReceived = isReceived;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
    }
   
     @Id 

    
    @Column(name="DeliveryNoteDetailId", unique=true, nullable=false, length=36)
    public String getDeliveryNoteDetailId() {
        return this.deliveryNoteDetailId;
    }
    
    public void setDeliveryNoteDetailId(String deliveryNoteDetailId) {
        this.deliveryNoteDetailId = deliveryNoteDetailId;
    }

    
    @Column(name="DeliveryNoteId", nullable=false, length=30)
    public String getDeliveryNoteId() {
        return this.deliveryNoteId;
    }
    
    public void setDeliveryNoteId(String deliveryNoteId) {
        this.deliveryNoteId = deliveryNoteId;
    }

    
    @Column(name="DeliveryRequestDetailId", nullable=false, length=36)
    public String getDeliveryRequestDetailId() {
        return this.deliveryRequestDetailId;
    }
    
    public void setDeliveryRequestDetailId(String deliveryRequestDetailId) {
        this.deliveryRequestDetailId = deliveryRequestDetailId;
    }

    
    @Column(name="DeliveryRequestId", nullable=false, length=30)
    public String getDeliveryRequestId() {
        return this.deliveryRequestId;
    }
    
    public void setDeliveryRequestId(String deliveryRequestId) {
        this.deliveryRequestId = deliveryRequestId;
    }

    
    @Column(name="MaterialSerialNumber", nullable=false, length=40)
    public String getMaterialSerialNumber() {
        return this.materialSerialNumber;
    }
    
    public void setMaterialSerialNumber(String materialSerialNumber) {
        this.materialSerialNumber = materialSerialNumber;
    }

    
    @Column(name="ParentSerialNumber", length=40)
    public String getParentSerialNumber() {
        return this.parentSerialNumber;
    }
    
    public void setParentSerialNumber(String parentSerialNumber) {
        this.parentSerialNumber = parentSerialNumber;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EventDate", length=23)
    public Date getEventDate() {
        return this.eventDate;
    }
    
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    
    @Column(name="EventStatusId", length=40)
    public String getEventStatusId() {
        return this.eventStatusId;
    }
    
    public void setEventStatusId(String eventStatusId) {
        this.eventStatusId = eventStatusId;
    }

    
    @Column(name="PlanSLBOQId", length=36)
    public String getPlanSlboqid() {
        return this.planSlboqid;
    }
    
    public void setPlanSlboqid(String planSlboqid) {
        this.planSlboqid = planSlboqid;
    }

    
    @Column(name="PlanRegionId", length=40)
    public String getPlanRegionId() {
        return this.planRegionId;
    }
    
    public void setPlanRegionId(String planRegionId) {
        this.planRegionId = planRegionId;
    }

    
    @Column(name="PlanAreaId", length=40)
    public String getPlanAreaId() {
        return this.planAreaId;
    }
    
    public void setPlanAreaId(String planAreaId) {
        this.planAreaId = planAreaId;
    }

    
    @Column(name="PlanSiteId", length=40)
    public String getPlanSiteId() {
        return this.planSiteId;
    }
    
    public void setPlanSiteId(String planSiteId) {
        this.planSiteId = planSiteId;
    }

    
    @Column(name="ActualSLBOQId", length=36)
    public String getActualSlboqid() {
        return this.actualSlboqid;
    }
    
    public void setActualSlboqid(String actualSlboqid) {
        this.actualSlboqid = actualSlboqid;
    }

    
    @Column(name="ActualRegionId", length=40)
    public String getActualRegionId() {
        return this.actualRegionId;
    }
    
    public void setActualRegionId(String actualRegionId) {
        this.actualRegionId = actualRegionId;
    }

    
    @Column(name="ActualAreaId", length=40)
    public String getActualAreaId() {
        return this.actualAreaId;
    }
    
    public void setActualAreaId(String actualAreaId) {
        this.actualAreaId = actualAreaId;
    }

    
    @Column(name="ActualSiteId", length=40)
    public String getActualSiteId() {
        return this.actualSiteId;
    }
    
    public void setActualSiteId(String actualSiteId) {
        this.actualSiteId = actualSiteId;
    }

    
    @Column(name="IsReceived")
    public Boolean getIsReceived() {
        return this.isReceived;
    }
    
    public void setIsReceived(Boolean isReceived) {
        this.isReceived = isReceived;
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




}


