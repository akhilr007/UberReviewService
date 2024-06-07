package com.akhil.UberReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "passengerReviewId")
public class PassengerReview extends Review{

    private String passengerReviewContent;
}
