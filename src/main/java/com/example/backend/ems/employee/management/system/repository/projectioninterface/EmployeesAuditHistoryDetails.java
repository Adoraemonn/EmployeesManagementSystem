package com.example.backend.ems.employee.management.system.repository.projectioninterface;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

/**
 * A projection interface for retrieving employee audit history details.
 */
public interface EmployeesAuditHistoryDetails {

    /**
     * @return the history ID
     */
    Long getHistId();

    /**
     * @return the employee's ID
     */
    Long getEmployeeId();

    /**
     * @return the employee's first name
     */
    String getFirstName();

    /**
     * @return the employee's last name
     */
    String getLastName();

    /**
     * @return the employee's email address
     */
    String getEmail();

    /**
     * @return the employee's phone number
     */
    String getPhoneNumber();

    /**
     * @return the employee's hire date
     */
    Date getHireDate();

    /**
     * @return the employee's job ID
     */
    String getJobId();

    /**
     * @return the employee's salary
     */
    BigDecimal getSalary();

    /**
     * @return the employee's commission percentage
     */
    BigDecimal getCommissionPct();

    /**
     * @return the employee's manager's ID
     */
    Long getManagerId();

    /**
     * @return the employee's department's ID
     */
    Long getDepartmentId();

    /**
     * @return 1 if the employee exists, 0 otherwise
     */
    Integer getEmployeeExist();

    /**
     * @return the employee's employment end date
     */
    Instant getEmpEndDate();

    /**
     * @return the audit action performed
     */
    String getAuditAction();

    /**
     * @return the user who performed the audit action
     */
    String getAuditUser();

    /**
     * @return the version number
     */
    Integer getVersionNo();

    /**
     * @return the audit timestamp
     */
    Instant getAuditDttm();
}
