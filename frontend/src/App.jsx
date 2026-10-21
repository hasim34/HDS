import { useState , useNavigate} from 'react'
// import heroImg from './assets/hero.png'
// import reactLogo from './assets/react.svg'
// import viteLogo from './assets/vite.svg'
// import './App.css'
import { Routes, Route, Link } from 'react-router-dom';
import Materials from './components/Materials';


function App() {
  return (
  <>
      {/* <h1>Hello</h1> */}
      <Link to="/materials">Materials Dashboard</Link>
    

    <Routes>
      <Route path="/materials" element={<Materials/>}></Route>
    </Routes> 
  </>
  );
}

export default App
