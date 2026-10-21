package com.hdsupply.orderPriorityPlanner.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdsupply.orderPriorityPlanner.DTO.SuccessRequestDTO;
import com.hdsupply.orderPriorityPlanner.Service.JobService;

import lombok.RequiredArgsConstructor;

/**
 * JobController
 */
@RestController 
@RequestMapping ("/jobs")
// @RequiredArgsConstructor 
public class JobController {
    private final JobService jobService;
    public JobController(JobService jobService){
        this.jobService=jobService;
    }
    @GetMapping 
    public Object getJobs(){
        return jobService.implementQueue();
        // return new SuccessRequestDTO(HttpStatus.ACCEPTED.value(),LocalDateTime.now(),"OK",null);
        // return null;
    }
}