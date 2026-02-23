import { EmployeeDTO } from '../../types/employee'
import './EmployeeCard.css'

interface EmployeeCardProps {
  employee: EmployeeDTO
  onClick?: (id: number) => void
}

export const EmployeeCard: React.FC<EmployeeCardProps> = ({ employee, onClick }) => {
  return (
    <div className="employee-card" onClick={() => onClick?.(employee.employeeId)}>
      <div className="employee-header">
        <h3>{employee.firstName} {employee.lastName}</h3>
        <span className="employee-id">ID: {employee.employeeId}</span>
      </div>
      <div className="employee-body">
        <p>
          <strong>Email:</strong> <a href={`mailto:${employee.emailId}`}>{employee.emailId}</a>
        </p>
        <p>
          <strong>Phone:</strong> {employee.phoneNumber}
        </p>
        <p>
          <strong>Job ID:</strong> {employee.jobId}
        </p>
        <p>
          <strong>Salary:</strong> ${employee.salary?.toLocaleString() || 'N/A'}
        </p>
        {employee.departmentId && (
          <p>
            <strong>Department:</strong> {employee.departmentId}
          </p>
        )}
      </div>
    </div>
  )
}

