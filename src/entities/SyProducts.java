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
 * SyProducts generated by hbm2java
 */
@Entity
@Table(name="SyProducts"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class SyProducts  implements java.io.Serializable {


     private String productsId;
     private String productsParentId;
     private String productsName;
     private String productsSubName;
     private Boolean isDelete;
     private Boolean isSelected;
     private Date createdDate;
     private String createdBy;
     private Date modifiedDate;
     private String modifiedBy;

    public SyProducts() {
    }

	
    public SyProducts(String productsId) {
        this.productsId = productsId;
    }
    public SyProducts(String productsId, String productsParentId, String productsName, String productsSubName, Boolean isDelete, Boolean isSelected, Date createdDate, String createdBy, Date modifiedDate, String modifiedBy) {
       this.productsId = productsId;
       this.productsParentId = productsParentId;
       this.productsName = productsName;
       this.productsSubName = productsSubName;
       this.isDelete = isDelete;
       this.isSelected = isSelected;
       this.createdDate = createdDate;
       this.createdBy = createdBy;
       this.modifiedDate = modifiedDate;
       this.modifiedBy = modifiedBy;
    }
   
     @Id 

    
    @Column(name="ProductsId", unique=true, nullable=false, length=40)
    public String getProductsId() {
        return this.productsId;
    }
    
    public void setProductsId(String productsId) {
        this.productsId = productsId;
    }

    
    @Column(name="ProductsParentId", length=40)
    public String getProductsParentId() {
        return this.productsParentId;
    }
    
    public void setProductsParentId(String productsParentId) {
        this.productsParentId = productsParentId;
    }

    
    @Column(name="ProductsName", length=100)
    public String getProductsName() {
        return this.productsName;
    }
    
    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    
    @Column(name="ProductsSubName", length=50)
    public String getProductsSubName() {
        return this.productsSubName;
    }
    
    public void setProductsSubName(String productsSubName) {
        this.productsSubName = productsSubName;
    }

    
    @Column(name="IsDelete")
    public Boolean getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    
    @Column(name="IsSelected")
    public Boolean getIsSelected() {
        return this.isSelected;
    }
    
    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CreatedDate", length=23)
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    @Column(name="CreatedBy", length=20)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ModifiedDate", length=23)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    @Column(name="ModifiedBy", length=20)
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }




}


