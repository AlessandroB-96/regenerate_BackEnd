package com.synclab.regenerate.controller;

import com.synclab.regenerate.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
}
