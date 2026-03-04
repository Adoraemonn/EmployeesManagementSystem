package com.example.backend.ems.employee.management.system.repository.projectioninterface;

import java.time.Instant;
import java.util.Date;

/**
 * A projection interface for retrieving employee details.
 */
public interface EmployeeDetails {

    /**
     * @return the employee's ID
     */
    Integer getEmployeeId();

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
    String getEmailId();

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
    String getSalary();

    /**
     * @return the employee's commission percentage
     */
    String getCommissionPct();

    /**
     * @return the employee's manager's ID
     */
    Integer getManagerId();

    /**
     * @return the employee's department's ID
     */
    Integer getDepartmentId();

    /**
     * @return true if the employee exists, false otherwise
     */
    Boolean getEmployeeExist();

    /**
     * @return the employee's employment end date
     */
    Instant getEmploymentEndDate();

}
