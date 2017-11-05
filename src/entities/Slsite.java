package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


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

/**
 * Slsite generated by hbm2java
 */
@Entity
@Table(name="SLSite"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class Slsite  implements java.io.Serializable {


     private String slsiteId;
     private Slproject slproject;
     private String slsiteName;
     private Boolean isExists;
     private String productId;
     private Set slboqs = new HashSet(0);

    public Slsite() {
    }

	
    public Slsite(String slsiteId, Slproject slproject) {
        this.slsiteId = slsiteId;
        this.slproject = slproject;
    }
    public Slsite(String slsiteId, Slproject slproject, String slsiteName, Boolean isExists, String productId, Set slboqs) {
       this.slsiteId = slsiteId;
       this.slproject = slproject;
       this.slsiteName = slsiteName;
       this.isExists = isExists;
       this.productId = productId;
       this.slboqs = slboqs;
    }
   
     @Id 

    
    @Column(name="SLSiteId", unique=true, nullable=false, length=40)
    public String getSlsiteId() {
        return this.slsiteId;
    }
    
    public void setSlsiteId(String slsiteId) {
        this.slsiteId = slsiteId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SLProjectId", nullable=false)
    public Slproject getSlproject() {
        return this.slproject;
    }
    
    public void setSlproject(Slproject slproject) {
        this.slproject = slproject;
    }

    
    @Column(name="SLSiteName", length=100)
    public String getSlsiteName() {
        return this.slsiteName;
    }
    
    public void setSlsiteName(String slsiteName) {
        this.slsiteName = slsiteName;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="slsite")
    public Set getSlboqs() {
        return this.slboqs;
    }
    
    public void setSlboqs(Set slboqs) {
        this.slboqs = slboqs;
    }




}


