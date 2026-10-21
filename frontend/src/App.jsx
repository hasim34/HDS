import { useState, useNavigate } from 'react'
// import heroImg from './assets/hero.png'
// import reactLogo from './assets/react.svg'
// import viteLogo from './assets/vite.svg'
// import './App.css'
import { Routes, Route, Link } from 'react-router-dom';
import Materials from './components/Materials';
import OrderPriority from './components/OrderPriority';
import { useEffect } from 'react';


function App() {

  async function getData(params) {
    const response = await 
  }

  useEffect(() => {
    getData();
  },[]);
  return (
    <>
      {/* <h1>Hello</h1> */}
      <div style={{justifyContent:"space-between", alignItems:"center"}}>
        <Link to="/materials">Materials Dashboard</Link><p></p>
        <Link to="/admin">Order Priority</Link>
      </div>

      <Routes>
        <Route path="/materials" element={<Materials />}></Route>
        <Route path="/admin" element={<OrderPriority/>}></Route>
      </Routes>
    </>
  );
}

export default App
