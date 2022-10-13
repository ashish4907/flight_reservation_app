package com.home.flight_reservation_app.Repo;

import com.home.flight_reservation_app.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight,Long> {
}
