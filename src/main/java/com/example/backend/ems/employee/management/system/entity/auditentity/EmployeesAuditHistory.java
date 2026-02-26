package com.example.backend.ems.employee.management.system.entity.auditentity;

import com.example.backend.ems.employee.management.system.entity.baseentity.AbstractBaseEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEES_HIST", schema = "HR")
public class EmployeesAuditHistory extends AbstractBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HIST_ID")
    private Long histId;

    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;

    @Column(name = "FIRST_NAME", length = 25)
    private String firstName;

    @Column(name = "LAST_NAME", length = 20)
    private String lastName;

    @Column(name = "EMAIL", length = 30)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    private Date hireDate;

    @Column(name = "JOB_ID", length = 20)
    private String jobId;

    @Column(name = "SALARY", precision = 8, scale = 2)
    private BigDecimal salary;

    @Column(name = "COMMISSION_PCT", precision = 2, scale = 2)
    private BigDecimal commissionPct;

    @Column(name = "MANAGER_ID")
    private Long managerId;

    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(name = "EMPLOYEE_EXIST")
    private Integer employeeExist;

    @Column(name = "EMP_END_DATE")
    private Instant empEndDate;

    @Column(name = "AUDIT_ACTION", nullable = false, length = 10)
    private String auditAction;

    @Column(name = "AUDIT_USER", length = 255)
    private String auditUser;

    @Column(name = "VERSION_NO")
    private Integer versionNo;

    @Column(name = "AUDIT_DTTM", nullable = false, updatable = false)
    private Instant auditDttm;
}
