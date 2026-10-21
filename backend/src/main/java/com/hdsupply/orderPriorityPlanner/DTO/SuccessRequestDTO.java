package com.hdsupply.orderPriorityPlanner.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data 
@Builder
@AllArgsConstructor 

public class SuccessRequestDTO<T> {

    private int  status;
    private LocalDateTime timeStamp;
    private String message;
    private T data;
    
}
