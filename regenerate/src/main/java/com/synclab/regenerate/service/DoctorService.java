package com.synclab.regenerate.service;

import com.synclab.regenerate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private CustomerRepository customerRepository;
}
