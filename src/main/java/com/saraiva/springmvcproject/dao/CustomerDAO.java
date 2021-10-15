package com.saraiva.springmvcproject.dao;

import com.saraiva.springmvcproject.entities.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);
}
