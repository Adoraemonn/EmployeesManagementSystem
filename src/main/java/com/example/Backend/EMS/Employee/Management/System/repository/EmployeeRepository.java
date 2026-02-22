package com.example.Backend.EMS.Employee.Management.System.repository;

import com.example.Backend.EMS.Employee.Management.System.entity.Employees;
import com.example.Backend.EMS.Employee.Management.System.model.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

    @Query("SELECT new com.example.Backend.EMS.Employee.Management.System.model.EmployeeDTO(" +
            "e.employeeId, e.firstName, e.lastName, e.emailId, e.phoneNumber, e.hireDate, " +
            "e.jobId, e.salary, e.commissionPct, e.managerId, e.departmentId, e.runIdentifier, " +
            "e.createdDatetime, e.createdById, e.updatedDatetime, e.updatedById, e.errorFlagIndicator, e.errorText) " +
            "FROM Employees e WHERE e.employeeId = :employeeId")
    EmployeeDTO getEmployeeDetailsById(@Param("employeeId") Integer employeeId);


}
