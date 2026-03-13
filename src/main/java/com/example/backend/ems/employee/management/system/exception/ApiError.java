package com.example.backend.ems.employee.management.system.exception;

public record ApiError(
        int status,
        String error,
        String message
) {

}
