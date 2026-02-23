import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import './HomePage.css'

// ...existing code...

const HomePage: React.FC = () => {
  const [employeeId, setEmployeeId] = useState('')
  const navigate = useNavigate()

  const handleSearch = (e: React.FormEvent) => {
    e.preventDefault()
    if (employeeId.trim()) {
      navigate(`/employee/${employeeId}`)
    }
  }

  return (
    <div className="home-page">
      <div className="home-container">
        <h2>Welcome to Employee Management System</h2>
        <p>Search for an employee by ID to view their details</p>

        <form onSubmit={handleSearch} className="search-form">
          <div className="form-group">
            <label htmlFor="employeeId">Employee ID</label>
            <input
              id="employeeId"
              type="number"
              placeholder="Enter employee ID"
              value={employeeId}
              onChange={(e) => setEmployeeId(e.target.value)}
              min="1"
            />
          </div>
          <button type="submit" className="search-btn">
            Search
          </button>
        </form>

        <div className="info-section">
          <h3>Quick Start</h3>
          <ul>
            <li>Enter an employee ID in the search box above</li>
            <li>Click the Search button or press Enter</li>
            <li>View the employee's detailed information</li>
          </ul>
        </div>
      </div>
    </div>
  )
}

export default HomePage

