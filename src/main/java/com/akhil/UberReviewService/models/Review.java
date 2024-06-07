package com.akhil.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookingReview")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;

    private Double rating;


    @Override
    public String toString() {
        return "Review " + content + " " + rating + ".";
    }
}
