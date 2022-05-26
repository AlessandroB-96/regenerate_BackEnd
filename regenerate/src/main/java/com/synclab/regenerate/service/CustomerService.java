package com.synclab.regenerate.service;

import com.synclab.regenerate.model.Customer;
import com.synclab.regenerate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers () {
        return customerRepository.findAll();
    }

    public Customer getCustomerById (Long id){
        return customerRepository.findCustomerByIdCustomer(id);
    }

}
