package com.synclab.regenerate.service;

import com.synclab.regenerate.model.Department;
import com.synclab.regenerate.model.Visit;
import com.synclab.regenerate.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitService {

    @Autowired
    private VisitRepository visitRepository;

    public List<Visit> getAllVisits(){
        return visitRepository.findAll();
    }

    public List<Visit> findVisitsByIdDepartment(Department id) {
        return visitRepository.findVisitByIdDepartment(id);
    }

}
