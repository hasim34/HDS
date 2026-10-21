package com.hdsupply.orderPriorityPlanner.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdsupply.orderPriorityPlanner.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
    
}
