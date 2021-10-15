package com.saraiva.springmvcproject.service;

import com.saraiva.springmvcproject.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);
}
