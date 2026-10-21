package com.hdsupply.orderPriorityPlanner.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class JobItem extends BaseEntity{


    @ManyToOne
    @JoinColumn(name="jobId")
    private Job job;

    @ManyToOne
    @JoinColumn(name="materialId")
    private Material material;
    
    private Integer quantity;
    

     
    
}
