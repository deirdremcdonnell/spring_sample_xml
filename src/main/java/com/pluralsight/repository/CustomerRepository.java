package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * CustomerRepository
 */
public interface CustomerRepository {
    List<Customer> findAll();
}