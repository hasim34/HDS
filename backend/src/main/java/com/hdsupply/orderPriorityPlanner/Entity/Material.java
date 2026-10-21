package com.hdsupply.orderPriorityPlanner.Entity;

import java.text.DecimalFormat;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class Material extends BaseEntity {



    private String  materialName;
    private DecimalFormat unitPrice;
    private Integer setMaterialName;

    
}
