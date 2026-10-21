package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdsupply.orderPriorityPlanner.Entity.Material;

public interface MaterialRepository extends JpaRepository<Material,Long>{
    
}
