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

/**
 * Repository for accessing employee data.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

    /**
     * Retrieves the details of a specific employee.
     * @param employeeId the ID of the employee
     * @return the employee details
     */
    @Query(GET_EMPLOYEE_BY_ID)
    EmployeeDetails getEmployeeDetailsById(@Param("employeeId") Integer employeeId);

    /**
     * Retrieves a paginated list of all employee details.
     * @param pageable the pagination information
     * @return a page of employee details
     */
    @Query(GET_ALL_EMPLOYEE)
    Page<EmployeeDetails> getAllEmployeeDetailsByPagination(Pageable pageable);

    /**
     * Retrieves a list of all employee details.
     * @return a list of all employee details
     */
    @Query(GET_ALL_EMPLOYEE)
    List<EmployeeDetails> getAllEmployeeDetails();


}
