package com.hdsupply.orderPriorityPlanner.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hdsupply.orderPriorityPlanner.DTO.SuccessRequestDTO;
import com.hdsupply.orderPriorityPlanner.Entity.Customer;
import com.hdsupply.orderPriorityPlanner.Entity.Job;
import com.hdsupply.orderPriorityPlanner.Entity.JobItem;
import com.hdsupply.orderPriorityPlanner.Entity.Material;
import com.hdsupply.orderPriorityPlanner.Entity.Enum.JobStatus;
import com.hdsupply.orderPriorityPlanner.ExceptionHandler.ResourceNotFoundException;
import com.hdsupply.orderPriorityPlanner.Repository.CustomerRepository;
import com.hdsupply.orderPriorityPlanner.Repository.JobItemRepository;
import com.hdsupply.orderPriorityPlanner.Repository.JobRepository;
import com.hdsupply.orderPriorityPlanner.Repository.MaterialRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JobService {
    private final JobRepository jobRepository;
    private final JobItemRepository jobItemRepository;
    private final CustomerRepository customerRepository;
    private final MaterialRepository materialRepository;

    public SuccessRequestDTO implementQueue() {
        // System.out.println("hi");
        List<Customer> customerLists = new ArrayList<>();
        customerLists = customerRepository.findAll();
        List<Job> jobList = new ArrayList<>();
        jobList = jobRepository.findAll();

        Collections.sort(jobList, new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2) {
                return j1.getDueDate().compareTo(j2.getDueDate());
            }
        });
        // Collections.sort(jobList,(Job j1,Job j2)-> {return
        // j1.getDueDate().compareTo(j2.getDueDate())});
        // jobList.sort((Job j1,Job j2)-> {return
        // j1.getDueDate().compareTo(j2.getDueDate())});
        // for (Job job : jobList) {
        //     System.out.println(job.getJobName() + " " + job.getId() + " " + job.getCategory());
        //     Long id = job.getId();
        //     System.out.println("DMEOOOO");
        //     // System.out.println(jobItemRepository.findAll());
        //     // System.out.println("DEEMMMODHSOFH");
        //     List<JobItem> jobitems = new ArrayList<>();
        //     jobitems = jobItemRepository.findAll();
        //     // List<JobItem> jobitems = jobItemRepository.findAll();
        //     List<JobItem> neededItems = new ArrayList<>();
        //     // System.out.println(jobitems);
        //     for (JobItem jobItem : jobitems) {
        //         System.out.println();
        //         if (jobItem.getJob().getId() == id) {
        //             neededItems.add(jobItem);
        //         }
        //     }
        //     System.out.println(neededItems);

        //     System.out.println("Ceck ");
        //     for (JobItem jobItem : neededItems) {
        //         System.out.println("HIi" + jobItem);
        //         // System.out.println(jobItem);
        //         // System.out.println(jobItem.getMaterial().getMaterialName()+jobItem.getMaterial().getId());
        //         // Long availableStock =
        //         // materialRepository.findById(jobItem.getMaterial().getAvailableStock())
        //         // .orElse(null);
        //         // if (availableStock == null)
        //         // throw new ResourceNotFoundException("NO material ");

        //         // Material material =
        //         // materialRepository.findById(jobItem.getMaterial().getId()).orElse(null);
        //         // System.out.println("ihhi2");

        //         // if (material == null)
        //         // throw new ResourceNotFoundException("NO material ");
        //         // if (material.getAvailableStock() < jobItem.getQuantity()) {
        //         // throw new ResourceNotFoundException("Out of stock");
        //         // }
        //         // System.out.println("ihhi2");

        //     }
        //     System.out.println("HIII");

        //     job.setStatus(JobStatus.Ready);
        //     // if(material.getAvailableStock()<)
        // }
        // System.out.println(jobList);
        // return new SuccessRequestDTO<>(HttpStatus.ACCEPTED.value(), LocalDateTime.now(), "OK", jobItemRepository);
        return new SuccessRequestDTO<>(HttpStatus.ACCEPTED.value(), LocalDateTime.now(), "OK", jobList);

    }
}

// new Comparator<MyObject>() {
// @Override
// public int compare(MyObject o1, MyObject o2) {
// return o1.getStartDate().compareTo(o2.getStartDate());
// }