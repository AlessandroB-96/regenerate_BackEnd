package com.synclab.regenerate.controller;

import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.model.Doctor;
import com.synclab.regenerate.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public ResponseEntity<List<Doctor>> getAllDoctors (){
        List<Doctor> doctors = doctorService.getAllDoctors();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<List<Doctor>> getDoctorByIdDepartment (@PathVariable("id") Department id){
        List<Doctor> doctors = doctorService.findDoctorsByIdDepartment(id);
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

    @GetMapping("getDoctor/{name}")
    public ResponseEntity<Doctor> getDoctorIdByName (@PathVariable("name") String name){
        Doctor idDoc = doctorService.getDoctorIdByName(name);
        return new ResponseEntity<>(idDoc, HttpStatus.OK);
    }

}
