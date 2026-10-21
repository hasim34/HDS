package com.hdsupply.orderPriorityPlanner.DTO;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class ErrorResponseDTO {
    private String error;
    private String message;
    private int status;
    private LocalDateTime timestamp;
}
