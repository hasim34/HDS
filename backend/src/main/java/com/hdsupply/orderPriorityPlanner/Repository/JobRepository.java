package com.hdsupply.orderPriorityPlanner.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hdsupply.orderPriorityPlanner.Entity.Job;

@Repository 
public interface JobRepository extends JpaRepository<Job,Long> {
    
@Query("SELECT j FROM Job j ORDER BY j.dueDate")
List<Job> getAllJob();

List<Job> findByJobName(String name);
}


