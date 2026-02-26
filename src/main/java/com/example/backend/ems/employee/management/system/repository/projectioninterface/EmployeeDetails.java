package com.example.backend.ems.employee.management.system.repository.projectioninterface;

import java.time.Instant;
import java.util.Date;

public interface EmployeeDetails {

    Integer getEmployeeId();

    String getFirstName();

    String getLastName();

    String getEmailId();

    String getPhoneNumber();

    Date getHireDate();

    String getJobId();

    String getSalary();

    String getCommissionPct();

    Integer getManagerId();

    Integer getDepartmentId();

    Boolean getEmployeeExist();

    Instant getEmploymentEndDate();

}
