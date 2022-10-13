package com.home.flight_reservation_app.Repo;

import com.home.flight_reservation_app.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
