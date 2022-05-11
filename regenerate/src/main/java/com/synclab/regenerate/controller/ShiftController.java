package com.synclab.regenerate.controller;

import com.synclab.regenerate.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShiftController {

    @Autowired
    private ShiftService shiftService;
}
