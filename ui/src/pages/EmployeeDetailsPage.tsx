import { useParams, useNavigate } from 'react-router-dom'
import { useEmployee } from '../hooks/useEmployee'
import { LoadingSpinner } from '../components/LoadingSpinner/LoadingSpinner'
import { ErrorMessage } from '../components/ErrorMessage/ErrorMessage'
import './EmployeeDetailsPage.css'

const EmployeeDetailsPage: React.FC = () => {
  const { id } = useParams<{ id: string }>()
  const navigate = useNavigate()
  const employeeId = id ? Number.parseInt(id, 10) : null
  const { employee, loading, error } = useEmployee(employeeId)

  if (!employeeId) {
    return (
      <div className="employee-details-page">
        <ErrorMessage message="Invalid employee ID" />
        <button onClick={() => navigate('/')} className="back-btn">
          ← Back to Home
        </button>
      </div>
    )
  }

  if (loading) {
    return <LoadingSpinner />
  }

  if (error || !employee) {
    return (
      <div className="employee-details-page">
        <ErrorMessage message={error?.message || 'Employee not found'} />
        <button onClick={() => navigate('/')} className="back-btn">
          ← Back to Home
        </button>
      </div>
    )
  }

  return (
    <div className="employee-details-page">
      <button onClick={() => navigate('/')} className="back-btn">
        ← Back to Home
      </button>

      <div className="details-container">
        <div className="details-header">
          <h2>{employee.firstName} {employee.lastName}</h2>
          <span className="employee-id-badge">ID: {employee.employeeId}</span>
        </div>

        <div className="details-grid">
          <div className="details-section">
            <h3>Personal Information</h3>
            <div className="detail-row">
              <span className="label">First Name:</span>
              <span className="value">{employee.firstName}</span>
            </div>
            <div className="detail-row">
              <span className="label">Last Name:</span>
              <span className="value">{employee.lastName}</span>
            </div>
            <div className="detail-row">
              <span className="label">Email:</span>
              <span className="value">
                <a href={`mailto:${employee.emailId}`}>{employee.emailId}</a>
              </span>
            </div>
            <div className="detail-row">
              <span className="label">Phone:</span>
              <span className="value">{employee.phoneNumber}</span>
            </div>
          </div>

          <div className="details-section">
            <h3>Employment Information</h3>
            <div className="detail-row">
              <span className="label">Job ID:</span>
              <span className="value">{employee.jobId}</span>
            </div>
            <div className="detail-row">
              <span className="label">Salary:</span>
              <span className="value">${employee.salary?.toLocaleString() || 'N/A'}</span>
            </div>
            {employee.commissionPCT && (
              <div className="detail-row">
                <span className="label">Commission:</span>
                <span className="value">{employee.commissionPCT}%</span>
              </div>
            )}
            <div className="detail-row">
              <span className="label">Hire Date:</span>
              <span className="value">
                {new Date(employee.hireDate).toLocaleDateString()}
              </span>
            </div>
          </div>

          <div className="details-section">
            <h3>Organization</h3>
            {employee.managerId && (
              <div className="detail-row">
                <span className="label">Manager ID:</span>
                <span className="value">{employee.managerId}</span>
              </div>
            )}
            {employee.departmentId && (
              <div className="detail-row">
                <span className="label">Department ID:</span>
                <span className="value">{employee.departmentId}</span>
              </div>
            )}
          </div>

          {(employee.createdDatetime || employee.updatedDatetime) && (
            <div className="details-section">
              <h3>System Information</h3>
              {employee.createdDatetime && (
                <div className="detail-row">
                  <span className="label">Created:</span>
                  <span className="value">
                    {new Date(employee.createdDatetime).toLocaleString()}
                  </span>
                </div>
              )}
              {employee.createdById && (
                <div className="detail-row">
                  <span className="label">Created By:</span>
                  <span className="value">{employee.createdById}</span>
                </div>
              )}
              {employee.updatedDatetime && (
                <div className="detail-row">
                  <span className="label">Updated:</span>
                  <span className="value">
                    {new Date(employee.updatedDatetime).toLocaleString()}
                  </span>
                </div>
              )}
              {employee.updatedById && (
                <div className="detail-row">
                  <span className="label">Updated By:</span>
                  <span className="value">{employee.updatedById}</span>
                </div>
              )}
            </div>
          )}
        </div>
      </div>
    </div>
  )
}

export default EmployeeDetailsPage

