package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Slboq generated by hbm2java
 */
@Entity
@Table(name="SLBOQ"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class Slboq  implements java.io.Serializable {


     private String slboqid;
     private Slsite slsite;
     private TmRegion tmRegion;
     private String slponumber;
     private String areaId;
     private String projectId;
     private String idComplation;
     private String configRequirement;
     private String existingConfig;
     private String finalConfigPo;
     private Boolean isExists;
     private String productId;
     private String potype;
     private Boolean isOriginal;
     private String prevPonumber;
     private Integer createdBy;
     private Date createdDate;
     private Set logMaterialTaggingDetails = new HashSet(0);
     private Set proSiteProgresses = new HashSet(0);

    public Slboq() {
    }

	
    public Slboq(String slboqid, Slsite slsite, TmRegion tmRegion, String slponumber, String areaId, String projectId) {
        this.slboqid = slboqid;
        this.slsite = slsite;
        this.tmRegion = tmRegion;
        this.slponumber = slponumber;
        this.areaId = areaId;
        this.projectId = projectId;
    }
    public Slboq(String slboqid, Slsite slsite, TmRegion tmRegion, String slponumber, String areaId, String projectId, String idComplation, String configRequirement, String existingConfig, String finalConfigPo, Boolean isExists, String productId, String potype, Boolean isOriginal, String prevPonumber, Integer createdBy, Date createdDate, Set logMaterialTaggingDetails, Set proSiteProgresses) {
       this.slboqid = slboqid;
       this.slsite = slsite;
       this.tmRegion = tmRegion;
       this.slponumber = slponumber;
       this.areaId = areaId;
       this.projectId = projectId;
       this.idComplation = idComplation;
       this.configRequirement = configRequirement;
       this.existingConfig = existingConfig;
       this.finalConfigPo = finalConfigPo;
       this.isExists = isExists;
       this.productId = productId;
       this.potype = potype;
       this.isOriginal = isOriginal;
       this.prevPonumber = prevPonumber;
       this.createdBy = createdBy;
       this.createdDate = createdDate;
       this.logMaterialTaggingDetails = logMaterialTaggingDetails;
       this.proSiteProgresses = proSiteProgresses;
    }
   
     @Id 

    
    @Column(name="SLBOQId", unique=true, nullable=false, length=36)
    public String getSlboqid() {
        return this.slboqid;
    }
    
    public void setSlboqid(String slboqid) {
        this.slboqid = slboqid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SiteId", nullable=false)
    public Slsite getSlsite() {
        return this.slsite;
    }
    
    public void setSlsite(Slsite slsite) {
        this.slsite = slsite;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RegionId", nullable=false)
    public TmRegion getTmRegion() {
        return this.tmRegion;
    }
    
    public void setTmRegion(TmRegion tmRegion) {
        this.tmRegion = tmRegion;
    }

    
    @Column(name="SLPONumber", nullable=false, length=100)
    public String getSlponumber() {
        return this.slponumber;
    }
    
    public void setSlponumber(String slponumber) {
        this.slponumber = slponumber;
    }

    
    @Column(name="AreaId", nullable=false, length=20)
    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    
    @Column(name="ProjectId", nullable=false, length=40)
    public String getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    
    @Column(name="IdComplation", length=40)
    public String getIdComplation() {
        return this.idComplation;
    }
    
    public void setIdComplation(String idComplation) {
        this.idComplation = idComplation;
    }

    
    @Column(name="ConfigRequirement")
    public String getConfigRequirement() {
        return this.configRequirement;
    }
    
    public void setConfigRequirement(String configRequirement) {
        this.configRequirement = configRequirement;
    }

    
    @Column(name="ExistingConfig")
    public String getExistingConfig() {
        return this.existingConfig;
    }
    
    public void setExistingConfig(String existingConfig) {
        this.existingConfig = existingConfig;
    }

    
    @Column(name="FinalConfigPO")
    public String getFinalConfigPo() {
        return this.finalConfigPo;
    }
    
    public void setFinalConfigPo(String finalConfigPo) {
        this.finalConfigPo = finalConfigPo;
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

    
    @Column(name="POType", length=40)
    public String getPotype() {
        return this.potype;
    }
    
    public void setPotype(String potype) {
        this.potype = potype;
    }

    
    @Column(name="IsOriginal")
    public Boolean getIsOriginal() {
        return this.isOriginal;
    }
    
    public void setIsOriginal(Boolean isOriginal) {
        this.isOriginal = isOriginal;
    }

    
    @Column(name="PrevPONumber", length=100)
    public String getPrevPonumber() {
        return this.prevPonumber;
    }
    
    public void setPrevPonumber(String prevPonumber) {
        this.prevPonumber = prevPonumber;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="slboq")
    public Set getLogMaterialTaggingDetails() {
        return this.logMaterialTaggingDetails;
    }
    
    public void setLogMaterialTaggingDetails(Set logMaterialTaggingDetails) {
        this.logMaterialTaggingDetails = logMaterialTaggingDetails;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="slboq")
    public Set getProSiteProgresses() {
        return this.proSiteProgresses;
    }
    
    public void setProSiteProgresses(Set proSiteProgresses) {
        this.proSiteProgresses = proSiteProgresses;
    }




}


