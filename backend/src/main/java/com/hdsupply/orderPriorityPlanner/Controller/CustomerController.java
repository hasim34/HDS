package com.hdsupply.orderPriorityPlanner.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hdsupply.orderPriorityPlanner.DTO.CustomerDTO;
import com.hdsupply.orderPriorityPlanner.Entity.Customer;
import com.hdsupply.orderPriorityPlanner.Service.CustomerService;
import jakarta.validation.constraints.Positive;

@RestController
public class CustomerController {
    private CustomerService customerService;

 public CustomerController(CustomerService customerService){

    this.customerService=customerService;
 }


    @PostMapping("/customer")
    public String addUser(@RequestBody CustomerDTO customerDTO){
      return customerService.addUser(customerDTO);

    }
    @GetMapping("/customer")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }


    @GetMapping ("/customer/{id}")
    public Customer getCustomer( @PathVariable Long id){
        return customerService.getCustomer(id);
    }
}
