package com.akhil.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Booking extends BaseModel{

    @OneToOne(cascade = CascadeType.ALL)
    private Review review;

    private Date startTime;

    private Date endTime;

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    private Long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}
