export const API_BASE_URL = (import.meta.env.VITE_API_BASE_URL as string) || 'http://localhost:8080/api'

export const API_ENDPOINTS = {
  EMPLOYEE: {
    GET_BY_ID: '/employee/employeeId',
  },
} as const

