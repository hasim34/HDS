package com.hdsupply.orderPriorityPlanner.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdsupply.orderPriorityPlanner.DTO.CustomerDTO;
import com.hdsupply.orderPriorityPlanner.DTO.SuccessRequestDTO;
import com.hdsupply.orderPriorityPlanner.Entity.Customer;
import com.hdsupply.orderPriorityPlanner.ExceptionHandler.CustomerNotCreatedException;
import com.hdsupply.orderPriorityPlanner.ExceptionHandler.CustomerNotFoundException;
import com.hdsupply.orderPriorityPlanner.Repository.CustomerRepository;

@Service 
public class CustomerService {
  private  CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){

      this.customerRepository=customerRepository;
    }

    public String addUser(CustomerDTO customerDTO){
  
       Customer customer = new Customer();
       customer.setAddress(customerDTO.getAddress());
       customer.setEmailId(customerDTO.getEmailId());
       customer.setCustomerName(customerDTO.getCustomerName());
       customer.setPhoneNumber(customerDTO.getPhoneNumber());


      //  customerRepository.save(customer).orElseThrow(()->new CustomerNotCreatedException("cannot Create Customer"));
       customerRepository.save(customer);
       return "Customer Added Successfully";

    }
    public List<Customer> getAllCustomers(){

      return customerRepository.findAll();

    }
    public Customer getCustomer(Long id){
      return customerRepository.findById(id).orElse(null);
    }

}
