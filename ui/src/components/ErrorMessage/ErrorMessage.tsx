import './ErrorMessage.css'

interface ErrorMessageProps {
  message: string
  onDismiss?: () => void
}

export const ErrorMessage: React.FC<ErrorMessageProps> = ({ message, onDismiss }) => {
  return (
    <div className="error-message">
      <span>⚠️ {message}</span>
      {onDismiss && (
        <button onClick={onDismiss} className="dismiss-btn">
          ✕
        </button>
      )}
    </div>
  )
}

