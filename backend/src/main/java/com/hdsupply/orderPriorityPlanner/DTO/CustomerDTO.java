package com.hdsupply.orderPriorityPlanner.DTO;

import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class CustomerDTO {
    
    private String customerName;
    private Long phoneNumber;
    private String address;
    private String emailId;

}
