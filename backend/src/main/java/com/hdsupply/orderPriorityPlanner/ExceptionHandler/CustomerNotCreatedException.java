package com.hdsupply.orderPriorityPlanner.ExceptionHandler;

public class CustomerNotCreatedException extends RuntimeException {
    public  CustomerNotCreatedException(String message){
        super(message);
    }
    
}
