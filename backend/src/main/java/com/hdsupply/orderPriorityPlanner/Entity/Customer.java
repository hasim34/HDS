package com.hdsupply.orderPriorityPlanner.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity 
@Getter 
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
public class Customer extends BaseEntity {

    private String customerName;
    private Long phoneNumber;
    private String address;
    private String emailId;


    
}
