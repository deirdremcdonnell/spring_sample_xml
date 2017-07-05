package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * AnotherCustomerRepositoryImpl
 */
public class AnotherCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers= new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("Alternative");
        customer.setLastName("McDonnell");
        customers.add(customer);
        customer = new Customer();
        customer.setFirstName("Another");
        customer.setLastName("Bell");
        customers.add(customer);
        return customers;
    }
}