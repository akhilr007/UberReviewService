package com.akhil.UberReviewService.repositories;

import com.akhil.UberReviewService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
