package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * CustomerService
 */
public interface CustomerService {
    List<Customer> findAll();
}