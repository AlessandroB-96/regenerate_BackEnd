package com.synclab.regenerate.repository;

import com.synclab.regenerate.model.Customer;
import com.synclab.regenerate.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findReservationByDate(java.sql.Date date);
    List<Reservation> findReservationByIdCustomer(Customer id);

}
