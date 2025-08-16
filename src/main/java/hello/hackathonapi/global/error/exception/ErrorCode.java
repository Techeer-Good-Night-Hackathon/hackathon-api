package hello.hackathonapi.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // USER
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "USER_404", "사용자를 찾을 수 없습니다."),
    USER_LIST_EMPTY(HttpStatus.NOT_FOUND, "USER_404", "조회할 사용자가 없습니다."),
    USER_ALREADY_EXISTS(HttpStatus.CONFLICT, "USER_409", "이미 존재하는 사용자입니다."),
    INVALID_USER_INPUT(HttpStatus.BAD_REQUEST, "USER_400", "사용자 입력값이 올바르지 않습니다."),
    
    // SEAT
    SEAT_NOT_FOUND(HttpStatus.NOT_FOUND, "SEAT_404", "좌석을를 찾을 수 없습니다."),
    SEAT_LIST_EMPTY(HttpStatus.NOT_FOUND, "SEAT_404", "조회할 좌석이 없습니다."),
    INVALID_SEAT_INPUT(HttpStatus.BAD_REQUEST, "SEAT_400", "사용자 입력값이 올바르지 않습니다."),
    
    // CONCERT
    CONCERT_NOT_FOUND(HttpStatus.NOT_FOUND, "CONCERT_404", "공연을 찾을 수 없습니다."),
    CONCERT_LIST_EMPTY(HttpStatus.NOT_FOUND, "CONCERT_404", "조회할 공연이 없습니다."),
    INVALID_CONCERT_DATE(HttpStatus.BAD_REQUEST, "CONCERT_400", "공연 날짜가 올바르지 않습니다."),
    INVALID_CONCERT_INPUT(HttpStatus.BAD_REQUEST, "CONCERT_400", "공연 입력값이 올바르지 않습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}