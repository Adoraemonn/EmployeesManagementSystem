import { useState, useEffect } from 'react'
import { EmployeeDTO } from '../types/employee'
import employeeService from '../services/employeeService'

interface UseEmployeeResult {
  employee: EmployeeDTO | null
  loading: boolean
  error: Error | null
}

export const useEmployee = (employeeId: number | null): UseEmployeeResult => {
  const [employee, setEmployee] = useState<EmployeeDTO | null>(null)
  const [loading, setLoading] = useState(false)
  const [error, setError] = useState<Error | null>(null)

  useEffect(() => {
    if (!employeeId) {
      setEmployee(null)
      return
    }

    const fetchEmployee = async () => {
      setLoading(true)
      setError(null)
      try {
        const data = await employeeService.getEmployeeById(employeeId)
        setEmployee(data)
      } catch (err) {
        setError(err instanceof Error ? err : new Error('Unknown error occurred'))
      } finally {
        setLoading(false)
      }
    }

    fetchEmployee()
  }, [employeeId])

  return { employee, loading, error }
}

