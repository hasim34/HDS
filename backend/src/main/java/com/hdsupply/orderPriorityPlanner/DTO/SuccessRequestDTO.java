package com.hdsupply.orderPriorityPlanner.DTO;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;


@Data 

@Builder

public class SuccessRequestDTO {

    private int  status;
    private LocalDateTime timeStamp;
    private String message;

    
}
