import { useState } from 'react'
import {Routes, Route, Link} from "react-router-dom";
import Dashboard from "./components/Dashboard"

function App() {

  return (
    <>
      <a>
        <Link to="/dashboard">Manager Dashboard</Link>
      </a>

      <Routes>
        <Route path="/dashboard" Component={<Dashboard/>}></Route>
      </Routes>
    </>
  )
}

export default App
