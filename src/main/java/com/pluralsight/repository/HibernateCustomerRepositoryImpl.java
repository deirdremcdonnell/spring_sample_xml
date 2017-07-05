
package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * HibernateCustomerRepositoryImpl
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    public List<Customer> findAll(){
        List<Customer> customers= new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("Deirdre");
        customer.setLastName("McDonnell");
        customers.add(customer);
        customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Bell");
        customers.add(customer);
        return customers;
    }
}