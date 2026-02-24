package com.example.backend.ems.employee.management.system.repository.query;

public interface EmployeeQuery {

    String GET_EMPLOYEE_BY_ID = """
            SELECT new com.example.backend.ems.employee.management.system.model.EmployeeDTO(
            e.employeeId, e.firstName, e.lastName, e.emailId, e.phoneNumber, e.hireDate,
            e.jobId, e.salary, e.commissionPct, e.managerId, e.departmentId, employeeExist, e.employmentEndDate, e.runIdentifier,
            e.createdDatetime, e.createdById, e.updatedDatetime, e.updatedById, e.errorFlagIndicator, e.errorText)
            FROM Employees e WHERE e.employeeId = :employeeId
            """;

    String GET_ALL_EMPLOYEE = """
            SELECT new com.example.backend.ems.employee.management.system.model.EmployeeDTO(
            e.employeeId, e.firstName, e.lastName, e.emailId, e.phoneNumber, e.hireDate,
            e.jobId, e.salary, e.commissionPct, e.managerId, e.departmentId, e.employeeExist , e.employmentEndDate, e.runIdentifier,
            e.createdDatetime, e.createdById, e.updatedDatetime, e.updatedById, e.errorFlagIndicator, e.errorText)
            FROM Employees e ORDER BY e.employeeId DESC
            """;
}