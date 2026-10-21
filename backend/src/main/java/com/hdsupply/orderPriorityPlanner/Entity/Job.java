package com.hdsupply.orderPriorityPlanner.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.hdsupply.orderPriorityPlanner.Entity.Enum.JobStatus;
import com.hdsupply.orderPriorityPlanner.Entity.Enum.JobType;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@NoArgsConstructor 
public class Job extends BaseEntity {
    private String jobName;
    private JobType category;
    private LocalDateTime dueDate;
    private JobStatus status;

    @ManyToOne
    @JoinColumn(name="customerId")
    private Customer customer;





    
}
