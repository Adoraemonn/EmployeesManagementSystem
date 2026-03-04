package com.example.backend.ems.employee.management.system.controller.basecontroller;


import com.example.backend.ems.employee.management.system.repository.baserepository.EmployeeRepository;
import com.example.backend.ems.employee.management.system.repository.projectioninterface.EmployeeDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller for handling employee-related requests.
 */
@Slf4j
@RestController
@RequestMapping("/api/employee")
public class EmployeesController {

    private final EmployeeRepository employeeRepository;

    /**
     * Constructs an EmployeesController with the given EmployeeRepository.
     * @param employeeRepository the repository for employee data
     */
    public EmployeesController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * Retrieves the details of a specific employee.
     * @param employeeId the ID of the employee
     * @return the employee details
     */
    @GetMapping("/employeeId")
    public EmployeeDetails getEmployeeDetailsById(@RequestParam Integer employeeId) {
        log.info("getEmployeeDetailsById-->");
        return employeeRepository.getEmployeeDetailsById(employeeId);
    }

    /**
     * Retrieves a paginated list of all employee details.
     * @param pageable the pagination information
     * @return a page of employee details
     */
    @GetMapping("/all")
    Page<EmployeeDetails> getEmployeeDetailsByPage(Pageable pageable) {
        log.info("getAllEmployeeDetailsWithPagination : ");
        return employeeRepository.getAllEmployeeDetailsByPagination(pageable);
    }

    /**
     * Retrieves a list of all employee details without pagination.
     * @return a list of all employee details
     */
    @GetMapping("/allemployee")
    List<EmployeeDetails> getEmployeeDetails() {
        log.info("getALLEmployeeDetailsWithoutPagination : ");
        return employeeRepository.getAllEmployeeDetails();
    }


}
