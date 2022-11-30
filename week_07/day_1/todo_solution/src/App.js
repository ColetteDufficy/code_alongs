import './App.css';
import {useState} from 'react';

function App() {


//  --------------------------------------------------
// set up the State for the data for the componenet
// ---------------------------------------------------

  const [todoList, setTodoList] = useState([
    { name: "Buy shopping", priority: "high" },
    { name: "Clean bathroom", priority: "low" },
    { name: "Car's MOT", priority: "high" }
  ])

  const [taskName, setTaskName] = useState("")  
  const [priority, setPriority] = useState("");

  const nodeList = todoList.map( (task, index) => 
  // index needed otherwsie the browser will stat to register a error
  <li key={index} className={task.priority}> {task.name}</li>)


//  --------------------------------------------------
// Evenet handling functions
// ---------------------------------------------------

  const handleTaskInput = (event) => {
    setTaskName(event.target.value);
  }


  const handlePrioritySelect = (event) => {
    setPriority(event.target.value);
  }


  const saveNewTodo = (event) => {
    // prevent the default
    // which makes a submisson to a form, but we dont want to run the run. just make th submission
    event.preventDefault();
    // clone the itmes array 
    const todoListCopy = [...todoList]
    // push on a new object to the clone array 
    todoListCopy.push({name: taskName, priority: priority})
    // update the items state now that it has a new item
    setTodoList(todoListCopy)
    // reset the newItem field box
    setTaskName("")
    setPriority("")
  }




// --------------------------------------------------
// Return the JSX for the UI
// ---------------------------------------------------


  return (
    <>
      <h1>ToDo's</h1>
      
      {/* form has an onSubmit event */}
      <form onSubmit={saveNewTodo} >
        <label htmlFor="new-todo">Add a new todo:</label>
        {/* what is htmlFor? does it ave to match the id name? Yes */}
        <input 
        id="new-todo" 
        type="text" 
        value={taskName}
        onChange={handleTaskInput} />

        <label htmlFor="high">High</label>
        {/* we need a lable for each element in the jsx */}
        {/* htmlFor i am the label for the input with the id "high" so that they match */}
        <input 
        id="high" 
        // is this id got to tdo wih the db ultimately?
        type="radio" 
        checked={priority === "high"}
        // checked value is HTML. You can only have one radion button on at any one time. Its checking for a true or false. 
        name="prioritySelect" 
        value="high" 
        // what is name and value here. Value on inout is the text that is shown??
        onChange={handlePrioritySelect} /> 
        {/* is there ever a time where you add an arguement here? */}

        <label htmlFor="low">Low</label>
        <input 
        id="low" 
        type="radio" 
        checked={priority === "low"}
        name="prioritySelect" 
        // we know theyre in the same group because they have the same name
        value="low" 
        onChange={handlePrioritySelect}  /> 

        <input 
        type="submit" 
        value="Save item here" 
        className={"button"}/>
        {/* what is className here? */}
        {/* why doesnt this input have a name tag? */}
        {/* why doesnt this button have an onClick event - is it becasue its already covered by the form onSubmit event at the beginning?  */}
      </form>

      <ul>
        {nodeList}
      </ul>
    </>
  );
}

export default App;



