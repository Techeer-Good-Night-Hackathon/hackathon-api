package hello.hackathonapi.domain.seat.dto;

import hello.hackathonapi.domain.seat.entity.Seat;
import hello.hackathonapi.domain.seat.entity.SeatGrade;
import hello.hackathonapi.domain.seat.entity.SeatStatus;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SeatStatusResponse {
    private Long id;
    private Integer number;
    private SeatGrade grade;
    private Integer price;
    private SeatStatus status;

    public static SeatStatusResponse from(Seat seat) {
        return SeatStatusResponse.builder()
            .id(seat.getId())
            .number(seat.getNumber())
            .grade(seat.getGrade())
            .price(seat.getPrice())
            .status(seat.getStatus())
            .build();
    }
}
