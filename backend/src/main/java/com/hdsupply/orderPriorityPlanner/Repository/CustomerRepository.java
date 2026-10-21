package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdsupply.orderPriorityPlanner.Entity.Customer;

@Repository 
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    
}
