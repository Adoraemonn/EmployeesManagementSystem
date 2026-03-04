package com.example.backend.ems.employee.management.system.controller.auditcontroller;

import com.example.backend.ems.employee.management.system.exception.ResourceNotFoundException;
import com.example.backend.ems.employee.management.system.repository.auditrepository.EmployeeAuditRepository;
import com.example.backend.ems.employee.management.system.repository.projectioninterface.EmployeesAuditHistoryDetails;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for handling employee audit-related requests.
 */
@RestController
@RequestMapping("/api/employee/audit")
public class EmployeesAuditController {

    private static final Logger log = LoggerFactory.getLogger(EmployeesAuditController.class);

    private final EmployeeAuditRepository employeeAuditRepository;

    /**
     * Constructs an EmployeesAuditController with the given EmployeeAuditRepository.
     * @param employeeAuditRepository the repository for employee audit data
     */
    public EmployeesAuditController(EmployeeAuditRepository employeeAuditRepository) {
        this.employeeAuditRepository = employeeAuditRepository;
    }

    /**
     * Retrieves the audit history for a specific employee.
     * @param employeeId the ID of the employee
     * @return a list of employee audit history details
     * @throws ResourceNotFoundException if no audit history is found for the given employee ID
     */
    @Operation(summary = "Get employee audit details by ID",
               description = "Returns audit history for the given employee ID")
    @GetMapping("/employeeId")
    public List<EmployeesAuditHistoryDetails> getEmployeeDetailsById(
            @RequestParam Long employeeId) {

        log.info("Fetching employee audit details for id: {}", employeeId);

        List<EmployeesAuditHistoryDetails> details =
                employeeAuditRepository.findByEmployeeId(employeeId);

        if (details == null || details.isEmpty()) {
            throw new ResourceNotFoundException(
                    "Employee audit details not found for id: " + employeeId
            );
        }

        return details;
    }
}
