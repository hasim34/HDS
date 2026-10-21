package com.hdsupply.orderPriorityPlanner.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hdsupply.orderPriorityPlanner.Entity.Job;

@Repository 
public interface JobRepository extends JpaRepository<Job,Long> {
    // List<Job> findAllJobsOrderByDueDate();
// @Query("SELECT j FROM job j ORDER BY j.dueDate")
// List<Job> getAllJob();
}


