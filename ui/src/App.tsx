import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import './App.css'
import HomePage from './pages/HomePage'
import EmployeeDetailsPage from './pages/EmployeeDetailsPage'

function App() {
  return (
    <Router>
      <div className="app">
        <header className="app-header">
          <h1>Employee Management System</h1>
        </header>
        <main className="app-main">
          <Routes>
            <Route path="/" element={<HomePage />} />
            <Route path="/employee/:id" element={<EmployeeDetailsPage />} />
          </Routes>
        </main>
      </div>
    </Router>
  )
}

export default App

