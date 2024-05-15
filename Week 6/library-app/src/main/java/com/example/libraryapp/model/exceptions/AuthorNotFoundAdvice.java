package com.example.libraryapp.model.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestControllerAdvice
public class AuthorNotFoundAdvice {


    @ExceptionHandler(AuthorNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<AuthorNotFoundResponse> authorNotFoundHandler(AuthorNotFoundException e, HttpServletRequest request) { //object that represents a full HTTP response
        AuthorNotFoundResponse response = new AuthorNotFoundResponse(request.getRequestURL().toString(), e.getMessage(), 400);
        return ResponseEntity.badRequest().body(response);
    }
}
