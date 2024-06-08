package com.akhil.UberReviewService.services;

import com.akhil.UberReviewService.models.Booking;
import com.akhil.UberReviewService.models.BookingStatus;
import com.akhil.UberReviewService.models.Review;
import com.akhil.UberReviewService.repositories.BookingRepository;
import com.akhil.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Review r = Review
                    .builder()
                    .rating(4.7)
                    .content("awesome diary!!")
                    .build();

        Booking b = Booking
                    .builder()
                    .startTime(new Date())
                    .bookingStatus(BookingStatus.ASSIGNING_DRIVER)
                    .review(r)
                    .build();

        bookingRepository.save(b);

    }
}
