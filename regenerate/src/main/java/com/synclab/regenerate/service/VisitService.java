package com.synclab.regenerate.service;

import com.synclab.regenerate.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitService {

    @Autowired
    private VisitRepository visitRepository;
}
