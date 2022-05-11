package com.synclab.regenerate.controller;

import com.synclab.regenerate.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
}
