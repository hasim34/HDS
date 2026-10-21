package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdsupply.orderPriorityPlanner.Entity.Job;

public interface JobRepository extends JpaRepository<Job,Long> {
    
}
