package com.synclab.regenerate.controller;

import com.synclab.regenerate.model.Reservation;
import com.synclab.regenerate.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/{date}")
    public ResponseEntity<List<Reservation>> reservationByDate (@PathVariable ("date") java.sql.Date date ) {
        List<Reservation> reservations = reservationService.reservationByDate(date);
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

}
