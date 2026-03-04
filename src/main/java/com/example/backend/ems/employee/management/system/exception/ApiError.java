package com.example.backend.ems.employee.management.system.exception;

/**
 * Represents a standard API error response.
 * @param status the HTTP status code
 * @param error the error code or short description
 * @param message a more detailed error message
 */
public record ApiError(
        int status,
        String error,
        String message
) {

}