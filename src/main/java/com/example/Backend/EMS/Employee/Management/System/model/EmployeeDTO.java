package com.example.Backend.EMS.Employee.Management.System.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

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
    private String runIdentifier;
    private Instant createdDatetime;
    private String createdById;
    private Instant updatedDatetime;
    private String updatedById;
    private Boolean errorFlagIndicator;
    private String errorText;

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
        this.runIdentifier = runIdentifier;
        this.createdDatetime = createdDatetime;
        this.createdById = createdById;
        this.updatedDatetime = updatedDatetime;
        this.updatedById = updatedById;
        this.errorFlagIndicator = errorFlagIndicator;
        this.errorText = errorText;
    }
}
