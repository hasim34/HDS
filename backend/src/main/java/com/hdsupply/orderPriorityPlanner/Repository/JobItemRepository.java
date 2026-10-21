package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdsupply.orderPriorityPlanner.Entity.JobItem;

public interface JobItemRepository extends JpaRepository<JobItem,Long>{
    
}
