# Employee Management System - Frontend UI

This is a React TypeScript frontend for the Employee Management System project.

## Project Structure

```
ui/
├── public/                 # Static assets
├── src/
│   ├── components/        # Reusable React components
│   ├── pages/             # Page components
│   ├── services/          # API services
│   ├── hooks/             # Custom React hooks
│   ├── utils/             # Utility functions
│   ├── types/             # TypeScript type definitions
│   ├── constants/         # Application constants
│   ├── styles/            # Global styles
│   ├── App.tsx            # Main App component
│   ├── main.tsx           # Application entry point
│   └── index.css          # Global CSS
├── package.json           # Project dependencies
├── tsconfig.json          # TypeScript configuration
└── README.md             # This file
```

## Prerequisites

- Node.js (v18 or higher)
- npm or yarn

## Installation

```bash
# Navigate to the ui folder
cd ui

# Install dependencies
npm install
```

## Environment Setup

1. Copy `.env.example` to `.env.local`:
```bash
cp .env.example .env.local
```

2. Update the environment variables in `.env.local` as needed:
```
VITE_API_BASE_URL=http://localhost:8080/api
```

## Development

Start the development server:

```bash
npm start
```

The application will open at `http://localhost:3000`

## Build

Create a production build:

```bash
npm run build
```

## Testing

Run the test suite:

```bash
npm test
```

## Available Scripts

- `npm start` - Start development server
- `npm run build` - Create production build
- `npm test` - Run tests
- `npm run eject` - Eject from Create React App (irreversible)

## Project Features

- React 18 with TypeScript
- React Router v6 for navigation
- Axios for HTTP requests
- Path aliases for cleaner imports
- Responsive UI components
- Type-safe API integration

## API Integration

The frontend communicates with the backend Employee Management System API:

- Base URL: `http://localhost:8080/api`
- Endpoints: 
  - `GET /employee/employeeId?employeeId={id}` - Get employee details by ID

## Contributing

1. Create a new branch for your feature
2. Make your changes
3. Ensure TypeScript compilation is successful
4. Submit a pull request

## License

This project is part of the Employee Management System.

