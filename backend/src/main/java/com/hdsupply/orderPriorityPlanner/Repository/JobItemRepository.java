package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdsupply.orderPriorityPlanner.Entity.JobItem;

@Repository 
public interface JobItemRepository extends JpaRepository<JobItem,Long>{
    
}
