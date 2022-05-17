package com.synclab.regenerate.service;

import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    //Method that returns all the departments
    public List<Department> findAllDepartment (){
        return departmentRepository.findAll();
    }

    //Method that return a department name based on id
    public String findDepartmentNameById ( Long id ){
        Department department = departmentRepository.findDepartmentByIdDepartment(id);
        return department.getName();
    }

    //Method that return a department based on id
    public Department findDepartmentById (Long id) {
        Department department = departmentRepository.findDepartmentByIdDepartment(id);
        return department;
    }

    //Method that returns a department id with a given name
    public Long findIdDepartmentByName (String name){
        Department department = departmentRepository.findDepartmentByName(name);
        return department.getidDepartment();
    }

}
