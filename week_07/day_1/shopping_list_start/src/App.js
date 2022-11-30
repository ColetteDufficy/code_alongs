import './App.css';
import React, {useState} from 'react';


function App() {

  const [items, setItems] = useState([
    {name: "Milk", isPurchased: false },
    {name: "Beans", isPurchased: false },
    {name: "Stickers", isPurchased: false },
    {name: "Cheese", isPurchased: false },
  ])

  const [newItem, setNewItem] = useState("")

  const itemNodes = items.map( (item, index) => { 
    return (
      <li key = {index} className = { item.isPurchased ? "purchased" : "not-purchased" } >
        <span> { item.name } </span>
        { item.isPurchased ? <span className = "purchased"> Purchased</span> : <button onClick={ () => purchaseItem(index) }>Purchase this!</button> }
      </li>
      )
    } 
    );


    const handleInputChange = (event) => {
      setNewItem(event.target.value);
    }

    const saveNewItem = (event) => {
      // prevent the default
      event.preventDefault();
      // clone the itmes array 
      const newItemsArr = [...items];
      // push on a new object to the clone array 
      newItemsArr.push( {name: newItem, isPurchased: false} ); 
      // update the items state now that it has a new item
      setItems(newItemsArr);
      // reset the newItem field box
      setNewItem("")
    }

    const purchaseItem = (index) => {
      // clone the current items
      const newItemsArr = [...items];
      // update the cloned(isPurchased) at the index
      newItemsArr[index].isPurchased = true;
      //set the items in State
      setItems(newItemsArr);


    }



  return (
    <div className="App"> 
    {/* needs to be className and not just class - a quirk in JS */}

      <h1>Shopping List</h1>
      <hr></hr>

      <form onSubmit = {saveNewItem}>
        <label htmlFor="new-item">Add new item</label>
        <input 
          type="text" 
          id="new-item" 
          value = {newItem}
          onChange = {handleInputChange}
          >
        </input>
        <input type="submit" value="Save new item"/>
      </form>

      <ul>
        {itemNodes}
      </ul>

      <form>
      </form>

    </div>
  );
}

export default App;
