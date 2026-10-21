package com.hdsupply.orderPriorityPlanner.Entity;

import java.text.DecimalFormat;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@Data 
public class Material extends BaseEntity {



    private String  materialName;
    private Long unitPrice;
    private Long availableStock;

    
}
