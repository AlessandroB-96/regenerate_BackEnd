package com.synclab.regenerate.controller;

import com.synclab.regenerate.model.Reservation;
import com.synclab.regenerate.service.ReservationService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PutMapping("/add")
    public ResponseEntity<Reservation> addReservation (@RequestBody Reservation reservation){
        Reservation newReservation = reservationService.addReservation(reservation);
        return new ResponseEntity<>(newReservation, HttpStatus.CREATED);
    }

}
