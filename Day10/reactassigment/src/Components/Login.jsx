import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const Login = () => {
    const [user,setUser]=useState({
        username:'',
        password:''
    })
    const navigate=useNavigate()

    function changeHandler(e){
        setUser({...user,[e.target.name]:e.target.value})
          console.log(user)
        }
    function submitHandler(e){
        e.preventDefault();
        localStorage.setItem("userData",JSON.stringify(user));
        navigate('/dashboard')
    }
  return (
    <div>
        <h1>Login Page</h1>

        <div>
            <p>UserName</p>
            <input type="text" name="username" value={user.username} onChange={changeHandler}/>
            <p>Password</p>
            <input type='password' name="password" value={user.password} onChange={changeHandler}/>
            <br/>
            <button onClick={(e)=>{submitHandler(e)}}>Login</button>
        </div>
    </div>
  )
}

export default Login