package com.example.backend.ems.employee.management.system.controller;


import com.example.backend.ems.employee.management.system.model.EmployeeDTO;
import com.example.backend.ems.employee.management.system.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/employee")
public class EmployeesController {

    private final EmployeeRepository employeeRepository;

    public EmployeesController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employeeId")
    public EmployeeDTO getEmployeeDetailsById(@RequestParam Integer employeeId) {
        log.info("getEmployeeDetailsById", employeeId);
        return employeeRepository.getEmployeeDetailsById(employeeId);
    }

    @GetMapping("/all")
    Page<EmployeeDTO> getEmployeeDetailsByPage(Pageable pageable) {
        log.info("getAllEmployeeDetailsWithPagination", pageable);
        return employeeRepository.getAllEmployeeDetailsByPagination(pageable);
    }

    @GetMapping("/allemployee")
    List<EmployeeDTO> getEmployeeDetails() {
        log.info("getALLEmployeeDetailsWithoutPagination");
        return employeeRepository.getAllEmployeeDetails();
    }


}
