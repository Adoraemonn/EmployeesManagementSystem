package com.example.backend.ems.employee.management.system.controller.auditcontroller;

import com.example.backend.ems.employee.management.system.repository.auditrepository.EmployeeAuditRepository;
import com.example.backend.ems.employee.management.system.repository.projectioninterface.EmployeesAuditHistoryDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/employee/audit")
public class EmployeesAuditController {

    private final EmployeeAuditRepository employeeAuditRepository;

    public EmployeesAuditController(EmployeeAuditRepository employeeAuditRepository) {
        this.employeeAuditRepository = employeeAuditRepository;
    }

    @GetMapping("/employeeId")
    public EmployeesAuditHistoryDetails getEmployeeDetailsById(@RequestParam Long employeeId) {
        log.info("getEmployeeDetailsById-->");
        return (EmployeesAuditHistoryDetails) employeeAuditRepository.findByEmployeeId(employeeId);
    }
}
