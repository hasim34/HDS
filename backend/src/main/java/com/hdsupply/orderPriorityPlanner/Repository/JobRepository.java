package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdsupply.orderPriorityPlanner.Entity.Job;

@Repository 
public interface JobRepository extends JpaRepository<Job,Long> {
    

}

