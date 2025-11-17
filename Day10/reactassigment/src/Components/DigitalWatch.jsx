import React, { useEffect, useState } from 'react'

const DigitalWatch = () => {
  const [date,setDate]=useState(new Date());
   useEffect(()=>{
   const timer= setInterval(()=>{
      setDate(new Date());
    },1000)

    return ()=>{
      clearInterval(timer)
    }
   },[date])
   const formatted = date.toLocaleTimeString();
  return (
    <div>
      <h2>Digital Watch</h2>
      <div>{formatted}</div>
    </div>
  )
}

export default DigitalWatch