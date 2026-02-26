package com.example.backend.ems.employee.management.system.repository.query;

public interface EmployeeQuery {

    String BASE_QUERY = """
            SELECT e.employeeId as employeeId,
                   e.firstName as firstName,
                   e.lastName as lastName,
                   e.emailId as emailId,
                   e.phoneNumber as phoneNumber,
                   e.hireDate as hireDate,
                   e.jobId as jobId,
                   e.salary as salary,
                   e.commissionPct as commissionPct,
                   e.managerId as managerId,
                   e.departmentId as departmentId,
                   e.employeeExist as employeeExist,
                   e.employmentEndDate as employmentEndDate
            FROM Employees e
            """;

    String GET_ALL_EMPLOYEE = BASE_QUERY;

    String GET_EMPLOYEE_BY_ID =
            BASE_QUERY + " WHERE e.employeeId = :employeeId ";

}