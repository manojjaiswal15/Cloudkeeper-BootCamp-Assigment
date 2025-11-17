import { Navigate } from "react-router-dom";

function ProtectedRoute({children}) {
  const userData = JSON.parse(localStorage.getItem("userData") || "{}")
  if (!userData.email && !userData.password) {
   return <Navigate to="/login" replace/>
  } 
  return children;
}

export default ProtectedRoute;