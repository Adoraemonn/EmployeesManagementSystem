export interface EmployeeDTO {
  employeeId: number
  firstName: string
  lastName: string
  emailId: string
  phoneNumber: string
  hireDate: string
  jobId: string
  salary: number
  commissionPCT?: number
  managerId?: number
  departmentId?: number
  runIdentifier?: string
  createdDatetime?: string
  createdById?: string
  updatedDatetime?: string
  updatedById?: string
  errorFlagIndicator?: boolean
  errorText?: string
}

export interface Employee extends EmployeeDTO {}

