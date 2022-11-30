// import logo from './logo.svg';

import { useState } from 'react'; //this is called a hook
import './App.css';

function App() {

  // const greeting = "Hello";
  //now that ive imported useState, lets update the function
  const [greeting, setGreeting] = useState("Hello world"); //whatever useState returns, we save it in to the parameters. It gives back two things. One is the curtrent stae and the other is the updated version of that object. 
  //in the useState function brackets, we insert the initial state that we want to begin with
  const [total, setTotal] = useState(0);
  const [countries, setCountries] = useState(
    [
      {name: "Argentina", score: 0},
      {name: "Ireland", score: 5}
    ]
  );

  const handleClick = (name) => {
    setGreeting(name)
  }
  
  // my version of the task:
  // const handleChange = (newTotal) => { 
  //   setTotal(newTotal)
  // }
  
  const deposit = (amount) => {
    setTotal(total + amount)
  }
  
  const withdraw = (amount) => {
    setTotal(total - amount)
  }


  return (
   //delete ALL the function definition from here
  //  <h1>Hello World</h1> to test its working
  // need to wrap the following two elements in a fragment which loks like <> and </> 
    <> 
      <h1>{greeting}</h1>
      <button onClick ={() => handleClick("Donald")} >Change button</button>

      <p>Total: £{total}</p>
      {/* }my version of the task: */}
      {/* <button onClick ={() => handleChange(total+10)} >Add 10 button</button> */} 
      {/* <button onClick ={() => handleChange(total-10)} >Remove 10 button</button> */}
      <button onClick ={() => (deposit(10))} >Deposit</button>
      <button onClick ={() => (withdraw(10))} >Withdraw</button>

    </>
    // when you do get clicked, go and look for the function called handleClick, but DONT run it!
  );
}

export default App;
