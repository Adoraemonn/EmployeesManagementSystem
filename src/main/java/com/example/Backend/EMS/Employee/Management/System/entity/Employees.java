package com.example.Backend.EMS.Employee.Management.System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Employees extends AbstractBaseEntity {

    @Id
    @Column(unique = true, nullable = false, name = "EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name = "FIRST_NAME", length = 25)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 20)
    private String lastName;

    @Column(name = "EMAIL", nullable = false, length = 30)
    private String emailId;

    @Column(name = "PHONE_NUMBER", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name = "HIRE_DATE", nullable = false)
    private Date hireDate;

    @Column(name = "JOB_ID", nullable = false, length = 20)
    private String jobId;

    @Column(name = "SALARY", precision = 8, scale = 2)
    private Integer salary;

    @Column(name = "COMMISSION_PCT", precision = 2, scale = 2)
    private Integer commissionPct;

    @Column(name = "MANAGER_ID")
    private Integer managerId;

    @Column(name = "DEPARTMENT_ID")
    private Integer departmentId;

}
