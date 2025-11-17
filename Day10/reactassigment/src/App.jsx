import './App.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Login from './Components/Login'
import Counter from './Components/Counter';
import DigitalWatch from './Components/DigitalWatch';
import DashBoard from './Components/DashBoard';
import ProtectedRoute from './Components/ProctectedRoute';
import Navbar from './Components/Navbar';


function App() {

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Navbar />} >
            <Route path="/login" element={<Login />} />
            <Route path="/counter" element={<ProtectedRoute><Counter /></ProtectedRoute>} />
            <Route path="/watch" element={<ProtectedRoute><DigitalWatch /></ProtectedRoute>} />
            <Route path="/dashboard" element={<ProtectedRoute><DashBoard /></ProtectedRoute>} />
            <Route path="*" element={<h2>404 Page not Found</h2>} />
          </Route>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
