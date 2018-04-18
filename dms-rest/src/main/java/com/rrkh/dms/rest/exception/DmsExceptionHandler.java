package com.rrkh.dms.rest.exception;

import com.rrkh.dms.data.exception.NotFoundException;
import com.rrkh.dms.rest.model.ErrorDto;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class DmsExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<ErrorDto> handleNotFoundException(NotFoundException ex, WebRequest request) {
        ErrorDto errorDetails = new ErrorDto(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
