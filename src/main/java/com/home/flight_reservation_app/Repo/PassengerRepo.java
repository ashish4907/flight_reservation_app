package com.home.flight_reservation_app.Repo;

import com.home.flight_reservation_app.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
}
