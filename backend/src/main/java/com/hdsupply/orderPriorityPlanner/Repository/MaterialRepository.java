package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdsupply.orderPriorityPlanner.Entity.Material;


@Repository 
public interface MaterialRepository extends JpaRepository<Material,Long>{
    
}
