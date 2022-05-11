package com.synclab.regenerate.controller;

import com.synclab.regenerate.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VisitController {

    @Autowired
    private VisitRepository visitRepository;
}
