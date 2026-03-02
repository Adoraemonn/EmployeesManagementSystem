package com.example.backend.ems.employee.management.system.repository.projectioninterface;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

public interface EmployeesAuditHistoryDetails {

    Long getHistId();

    Long getEmployeeId();

    String getFirstName();

    String getLastName();

    String getEmail();

    String getPhoneNumber();

    Date getHireDate();

    String getJobId();

    BigDecimal getSalary();

    BigDecimal getCommissionPct();

    Long getManagerId();

    Long getDepartmentId();

    Integer getEmployeeExist();

    Instant getEmpEndDate();

    String getAuditAction();

    String getAuditUser();

    Integer getVersionNo();

    Instant getAuditDttm();
}
