package com.synclab.regenerate.controller;

import com.synclab.regenerate.model.Reservation;
import com.synclab.regenerate.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/add")
    public ResponseEntity<Reservation> addReservation (@RequestBody Reservation reservation){
        Reservation newReservation = reservationService.addReservation(reservation);
        return new ResponseEntity<>(newReservation, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Reservation>> allReservation (){
        List<Reservation> allReservation = reservationService.allReservation();
        return new ResponseEntity<>(allReservation, HttpStatus.OK);
    }
}
