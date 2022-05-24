package com.synclab.regenerate.controller;

import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.model.Visit;
import com.synclab.regenerate.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/all")
    public ResponseEntity<List<Visit>> getAllVisits (){
        List<Visit> visits = visitService.getAllVisits();
        return new ResponseEntity<>(visits, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<List<Visit>> getVisitByIdDepartment (@PathVariable("id")Department id){
        List<Visit> visits = visitService.findVisitsByIdDepartment(id);
        return new ResponseEntity<>(visits, HttpStatus.OK);
    }

    @GetMapping("/getVisit/{name}")
    public ResponseEntity<Visit> getVisitByName (@PathVariable("name") String name){
        Visit id = visitService.findIdVisitByName(name);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
