package com.example.backend.ems.employee.management.system.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

/**
 * Data Transfer Object for Employee data.
 */
@Getter
@Setter
public class EmployeeDTO {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNumber;
    private Date hireDate;
    private String jobId;
    private Integer salary;
    private Integer commissionPCT;
    private Integer managerId;
    private Integer departmentId;
    private Boolean employeeExist;
    private Instant employmentEndDate;
    private String runIdentifier;
    private Instant createdDatetime;
    private String createdById;
    private Instant updatedDatetime;
    private String updatedById;
    private Boolean errorFlagIndicator;
    private String errorText;

    /**
     * Constructs a new EmployeeDTO with the specified details.
     * @param employeeId the employee's ID
     * @param firstName the employee's first name
     * @param lastName the employee's last name
     * @param emailId the employee's email address
     * @param phoneNumber the employee's phone number
     * @param hireDate the employee's hire date
     * @param jobId the employee's job ID
     * @param salary the employee's salary
     * @param commissionPCT the employee's commission percentage
     * @param managerId the employee's manager's ID
     * @param departmentId the employee's department's ID
     * @param employeeExist indicates if the employee exists
     * @param employmentEndDate the employee's employment end date
     * @param runIdentifier the run identifier
     * @param createdDatetime the created datetime
     * @param createdById the created by ID
     * @param updatedDatetime the updated datetime
     * @param updatedById the updated by ID
     * @param errorFlagIndicator the error flag indicator
     * @param errorText the error text
     */
    public EmployeeDTO(Integer employeeId,
                       String firstName,
                       String lastName,
                       String emailId,
                       String phoneNumber,
                       Date hireDate,
                       String jobId,
                       Integer salary,
                       Integer commissionPCT,
                       Integer managerId,
                       Integer departmentId,
                       Boolean employeeExist,
                       Instant employmentEndDate,
                       String runIdentifier,
                       Instant createdDatetime,
                       String createdById,
                       Instant updatedDatetime,
                       String updatedById,
                       Boolean errorFlagIndicator,
                       String errorText) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary;
        this.commissionPCT = commissionPCT;
        this.managerId = managerId;
        this.departmentId = departmentId;
        this.employeeExist = employeeExist;
        this.employmentEndDate = employmentEndDate;
        this.runIdentifier = runIdentifier;
        this.createdDatetime = createdDatetime;
        this.createdById = createdById;
        this.updatedDatetime = updatedDatetime;
        this.updatedById = updatedById;
        this.errorFlagIndicator = errorFlagIndicator;
        this.errorText = errorText;
    }
}
