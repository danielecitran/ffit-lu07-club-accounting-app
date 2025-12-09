package ch.bzz.db;
import org.springframework.data.jpa.repository.JpaRepository;

import ch.bzz.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    
}

