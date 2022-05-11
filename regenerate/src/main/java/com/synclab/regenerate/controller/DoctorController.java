package com.synclab.regenerate.controller;

import com.synclab.regenerate.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;
}
