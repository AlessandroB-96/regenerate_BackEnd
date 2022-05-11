package com.synclab.regenerate.controller;

import com.synclab.regenerate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;
}
