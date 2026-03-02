package com.example.backend.ems.employee.management.system.repository.baserepository;

import com.example.backend.ems.employee.management.system.entity.baseentity.Employees;
import com.example.backend.ems.employee.management.system.repository.projectioninterface.EmployeeDetails;
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
    EmployeeDetails getEmployeeDetailsById(@Param("employeeId") Integer employeeId);

    @Query(GET_ALL_EMPLOYEE)
    Page<EmployeeDetails> getAllEmployeeDetailsByPagination(Pageable pageable);

    @Query(GET_ALL_EMPLOYEE)
    List<EmployeeDetails> getAllEmployeeDetails();


}
