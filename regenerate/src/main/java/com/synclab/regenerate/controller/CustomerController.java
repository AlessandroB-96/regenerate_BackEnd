package com.synclab.regenerate.controller;

import com.synclab.regenerate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
}
