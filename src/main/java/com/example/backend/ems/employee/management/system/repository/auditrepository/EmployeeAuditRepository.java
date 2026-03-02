package com.example.backend.ems.employee.management.system.repository.auditrepository;

import com.example.backend.ems.employee.management.system.entity.baseentity.Employees;
import com.example.backend.ems.employee.management.system.repository.projectioninterface.EmployeesAuditHistoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeAuditRepository extends JpaRepository<Employees, Integer> {

    List<EmployeesAuditHistoryDetails> findByEmployeeId(Long employeeId);


}
