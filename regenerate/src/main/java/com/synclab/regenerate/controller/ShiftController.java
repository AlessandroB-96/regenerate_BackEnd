package com.synclab.regenerate.controller;

import com.synclab.regenerate.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShiftController {

    @Autowired
    private ShiftRepository shiftRepository;
}
