package com.synclab.regenerate.controller;

import com.synclab.regenerate.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;
}
