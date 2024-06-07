package com.akhil.UberReviewService.services;

import com.akhil.UberReviewService.models.Review;
import com.akhil.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Review r = Review
                    .builder()
                    .rating(4.1)
                    .content("Awesome!!")
                    .build();

    }
}
