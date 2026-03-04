package com.example.backend.ems.employee.management.system.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.context.annotation.Configuration;

/**
 * Configures OpenAPI documentation for the application.
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Employee Management System API",
                version = "1.0",
                description = "REST APIs for managing employees, departments, and roles",
                contact = @Contact(
                        name = "EMS Backend Team",
                        email = "support@ems.com"
                )
        ),
        security = @SecurityRequirement(name = "bearerAuth")
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT",
        description = "Enter JWT token in format: Bearer <token>"
)
public class OpenApiConfig {
}