import { useState , useNavigate} from 'react'
// import heroImg from './assets/hero.png'
// import reactLogo from './assets/react.svg'
// import viteLogo from './assets/vite.svg'
// import './App.css'
import { Routes, Route, Link } from 'react-router-dom';
import Dashboard from './components/Dashboard';
import { Button } from 'antd';


function App() {
  const navigate = useNavigate();
  return (
  <>
    <Button onClick={navigate("/dashboard")}>
      <Link to="/dashboard">Manager Dashboard</Link>
    </Button>

    <Routes>
      <Route path="/dashboard" Component={<Dashboard/>}></Route>
    </Routes> 
  </>
  );
}

export default App
