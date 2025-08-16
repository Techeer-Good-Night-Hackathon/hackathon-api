package hello.hackathonapi.domain.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hello.hackathonapi.domain.reservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
