import axios from 'axios'
import { API_BASE_URL, API_ENDPOINTS } from '../constants/api'
import { EmployeeDTO } from '../types/employee'

const apiClient = axios.create({
  baseURL: API_BASE_URL,
  headers: {
    'Content-Type': 'application/json',
  },
})

export const employeeService = {
  /**
   * Get employee details by ID
   * @param employeeId - The employee ID
   * @returns Promise<EmployeeDTO>
   */
  getEmployeeById: async (employeeId: number): Promise<EmployeeDTO> => {
    try {
      const response = await apiClient.get<EmployeeDTO>(
        API_ENDPOINTS.EMPLOYEE.GET_BY_ID,
        {
          params: { employeeId },
        }
      )
      return response.data
    } catch (error) {
      console.error('Error fetching employee:', error)
      throw error
    }
  },
}

export default employeeService

