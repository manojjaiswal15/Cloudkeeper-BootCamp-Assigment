import React, { useState } from 'react'

const Counter = () => {
  const [increaseCount,setIncreaseCount]=useState(0);
  return (
    <div>
      <h2>Counter Value</h2>
      <p>{increaseCount}</p>
      <button onClick={()=>{setIncreaseCount(increaseCount+1)}}>+</button> 
      &nbsp;
      <button onClick={()=>setIncreaseCount(increaseCount-1)}>-</button>
    </div>
  )
}

export default Counter