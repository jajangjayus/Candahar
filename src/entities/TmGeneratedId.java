package entities;
// Generated Nov 4, 2017 6:49:41 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TmGeneratedId generated by hbm2java
 */
@Entity
@Table(name="TmGeneratedId"
    ,schema="dbo"
    ,catalog="ProjectManagement"
)
public class TmGeneratedId  implements java.io.Serializable {


     private String descriptionId;
     private int counterId;
     private int maxId;

    public TmGeneratedId() {
    }

    public TmGeneratedId(String descriptionId, int counterId, int maxId) {
       this.descriptionId = descriptionId;
       this.counterId = counterId;
       this.maxId = maxId;
    }
   
     @Id 

    
    @Column(name="DescriptionId", unique=true, nullable=false, length=100)
    public String getDescriptionId() {
        return this.descriptionId;
    }
    
    public void setDescriptionId(String descriptionId) {
        this.descriptionId = descriptionId;
    }

    
    @Column(name="CounterId", nullable=false)
    public int getCounterId() {
        return this.counterId;
    }
    
    public void setCounterId(int counterId) {
        this.counterId = counterId;
    }

    
    @Column(name="MaxId", nullable=false)
    public int getMaxId() {
        return this.maxId;
    }
    
    public void setMaxId(int maxId) {
        this.maxId = maxId;
    }




}


