package com.hdsupply.orderPriorityPlanner.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
    
    // @OneToMany (mappedBy = "customer")
    // private List<Job> jobs = new ArrayList<>();

    
}
