package com.synclab.regenerate.service;

import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    //Method that
    public String findDepartmentById ( Long id ){
        Department department = departmentRepository.findDepartmentById(id);
        return department.getName();
    }
}
