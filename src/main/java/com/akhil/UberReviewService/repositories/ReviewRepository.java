package com.akhil.UberReviewService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.UberReviewService.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
