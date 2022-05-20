package com.synclab.regenerate.service;

import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.model.Doctor;
import com.synclab.regenerate.repository.CustomerRepository;
import com.synclab.regenerate.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }


    public List<Doctor> findDoctorsByIdDepartment(Department id) {
        return doctorRepository.findDoctorByIdDepartment(id);
    }

}
