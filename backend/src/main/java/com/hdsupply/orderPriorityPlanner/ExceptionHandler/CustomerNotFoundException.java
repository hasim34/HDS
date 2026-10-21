package com.hdsupply.orderPriorityPlanner.ExceptionHandler;



public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message){
        super(message);
    }
}
