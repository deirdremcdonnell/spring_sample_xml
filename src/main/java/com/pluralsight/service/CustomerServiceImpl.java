package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

import java.util.List;

// Business Logic resides in service tier
public class CustomerServiceImpl implements CustomerService {

    //private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl(); //hardcoded ref
    private CustomerRepository customerRepository;

//    public CustomerServiceImpl(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    public void setFoo(CustomerRepository customerRepositoryd) {
        this.customerRepository = customerRepositoryd;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}