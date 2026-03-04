package com.example.backend.ems.employee.management.system.repository.auditrepository;

import com.example.backend.ems.employee.management.system.entity.auditentity.EmployeesAuditHistory;
import com.example.backend.ems.employee.management.system.repository.projectioninterface.EmployeesAuditHistoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for accessing employee audit history data.
 */
@Repository
public interface EmployeeAuditRepository extends JpaRepository<EmployeesAuditHistory, Integer> {

    /**
     * Finds audit history for a given employee ID.
     * @param employeeId the ID of the employee
     * @return a list of employee audit history details
     */
    List<EmployeesAuditHistoryDetails> findByEmployeeId(Long employeeId);


}
