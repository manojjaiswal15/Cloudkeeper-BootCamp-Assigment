import React from 'react'
import { Link, Outlet } from 'react-router-dom'

const Navbar = () => {
  return (
    <div>
        <div>
            <Link to="/login">Login</Link> &nbsp;
            <Link to="/counter">Counter</Link> &nbsp;
            <Link to="watch">Watch</Link>
        </div>
        <Outlet/>
    </div>
  )
}

export default Navbar