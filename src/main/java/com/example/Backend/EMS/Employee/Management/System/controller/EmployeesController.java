package com.example.Backend.EMS.Employee.Management.System.controller;

import com.example.Backend.EMS.Employee.Management.System.model.EmployeeDTO;
import com.example.Backend.EMS.Employee.Management.System.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeesController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employeeId")
    public EmployeeDTO getEmployeeDetailsById(@RequestParam Integer employeeId) {
        return employeeRepository.getEmployeeDetailsById(employeeId);
    }
}
