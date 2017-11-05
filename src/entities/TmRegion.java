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
 * TmRegion generated by hbm2java
 */
@Entity
@Table(name="TmRegion"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class TmRegion  implements java.io.Serializable {


     private String regionId;
     private String regionName;
     private Boolean isExists;
     private String productId;
     private Integer createdBy;
     private Date createdDate;
     private Set slboqs = new HashSet(0);
     private Set tmAreas = new HashSet(0);

    public TmRegion() {
    }

	
    public TmRegion(String regionId) {
        this.regionId = regionId;
    }
    public TmRegion(String regionId, String regionName, Boolean isExists, String productId, Integer createdBy, Date createdDate, Set slboqs, Set tmAreas) {
       this.regionId = regionId;
       this.regionName = regionName;
       this.isExists = isExists;
       this.productId = productId;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.slboqs = slboqs;
       this.tmAreas = tmAreas;
    }
   
     @Id 

    
    @Column(name="RegionId", unique=true, nullable=false, length=20)
    public String getRegionId() {
        return this.regionId;
    }
    
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    
    @Column(name="RegionName", length=100)
    public String getRegionName() {
        return this.regionName;
    }
    
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    
    @Column(name="IsExists")
    public Boolean getIsExists() {
        return this.isExists;
    }
    
    public void setIsExists(Boolean isExists) {
        this.isExists = isExists;
    }

    
    @Column(name="ProductId", length=40)
    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    
    @Column(name="CreatedBy")
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CreatedDate", length=10)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tmRegion")
    public Set getSlboqs() {
        return this.slboqs;
    }
    
    public void setSlboqs(Set slboqs) {
        this.slboqs = slboqs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tmRegion")
    public Set getTmAreas() {
        return this.tmAreas;
    }
    
    public void setTmAreas(Set tmAreas) {
        this.tmAreas = tmAreas;
    }




}


