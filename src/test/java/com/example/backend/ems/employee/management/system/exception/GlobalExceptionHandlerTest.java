package com.example.backend.ems.employee.management.system.exception;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GlobalExceptionHandlerTest {

    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    @Test
    void handleInvalidRequestException_shouldReturnBadRequest() {
        InvalidRequestException ex = new InvalidRequestException("Invalid request");
        ResponseEntity<ApiError> response = handler.handleInvalidRequestException(ex);
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertEquals("Invalid request", response.getBody().message());
    }

    @Test
    void handleResourceNotFoundException_shouldReturnNotFound() {
        ResourceNotFoundException ex = new ResourceNotFoundException("Resource not found");
        ResponseEntity<ApiError> response = handler.handleResourceNotFoundException(ex);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertEquals("Resource not found", response.getBody().message());
    }

    @Test
    void handleNullPointerException_shouldReturnNotFound() {
        NullPointerException ex = new NullPointerException();
        ResponseEntity<ApiError> response = handler.handleNullPointerException(ex);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertEquals("Resource not found", response.getBody().message());
    }

    @Test
    void handleMethodArgumentTypeMismatch_shouldReturnBadRequest() {
        MethodArgumentTypeMismatchException ex = new MethodArgumentTypeMismatchException(null, null, null, null, null);
        ResponseEntity<ApiError> response = handler.handleMethodArgumentTypeMismatch(ex);
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertEquals("Invalid parameter type", response.getBody().message());
    }

    @Test
    void handleRuntimeException_shouldReturnInternalServerError() {
        RuntimeException ex = new RuntimeException("Internal error");
        ResponseEntity<ApiError> response = handler.handleRuntimeException(ex);
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertEquals("Internal error", response.getBody().message());
    }

    @Test
    void handleGenericException_shouldReturnInternalServerError() {
        Exception ex = new Exception("Something went wrong");
        ResponseEntity<ApiError> response = handler.handleGenericException(ex);
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertEquals("Something went wrong", response.getBody().message());
    }
}
