package com.example.backend.ems.employee.management.system.repository;

import com.example.backend.ems.employee.management.system.entity.Employees;
import com.example.backend.ems.employee.management.system.model.EmployeeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.backend.ems.employee.management.system.repository.query.EmployeeQuery.GET_ALL_EMPLOYEE;
import static com.example.backend.ems.employee.management.system.repository.query.EmployeeQuery.GET_EMPLOYEE_BY_ID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

    @Query(GET_EMPLOYEE_BY_ID)
    EmployeeDTO getEmployeeDetailsById(@Param("employeeId") Integer employeeId);

    @Query(GET_ALL_EMPLOYEE)
    Page<EmployeeDTO> getAllEmployeeDetailsByPagination(Pageable pageable);

    @Query(GET_ALL_EMPLOYEE)
    List<EmployeeDTO> getAllEmployeeDetails();


}
