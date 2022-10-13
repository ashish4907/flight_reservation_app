package com.home.flight_reservation_app.Repo;

import com.home.flight_reservation_app.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
