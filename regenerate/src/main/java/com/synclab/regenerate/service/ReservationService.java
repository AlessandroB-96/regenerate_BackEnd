package com.synclab.regenerate.service;

import com.synclab.regenerate.model.*;
import com.synclab.regenerate.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation addReservation (Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public List<Reservation> allReservation ( ){
        return reservationRepository.findAll();
    }

    public List<Reservation> reservationByDate (java.sql.Date date) {
        return reservationRepository.findReservationByDate(date);
    }
    public List<Reservation> findReservationByIdCustomer(Customer id) {

        return reservationRepository.findReservationByIdCustomer(id);
    }
}
