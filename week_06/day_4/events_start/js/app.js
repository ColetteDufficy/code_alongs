document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');


  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick); // calling the method addEventlIstener on the element "button", with the arguments of (event, callback function)


  const textInput = document.querySelector('#input');
  textInput.addEventListener('input', handleInput);


  const select = document.querySelector('#select');
  select.addEventListener('change', handleSelectChange);

  const form = document.querySelector('#form');
  form.addEventListener('submit', handleFormSubmit);
});




  const handleButtonClick = function() {
    const resultParagraph = document.querySelector('#button-result');
    resultParagraph.textContent = 'That button has definitely been clicked';
  }
  


  const handleInput = function () {
    // console.log('Input has been typed in');
    // console.log(event);
    
    // 1. get value from the Input
    const resultParagraph = document.querySelector('#input-result');
    // 2. Update paragraph text
    resultParagraph.textContent = `You typed: ${event.target.value}`;
  }


  
  
  // Add an event listener to the select element that listens for the change event, passing in the callback handleSelectChange, which you haven't written yet.
  // Write the callback handleSelectChange so that it updates the paragraph text below the select to be "You went with:" followed by the value of the selected option.
  // Hint: log the event object to check how to get the value from the select
  
  const handleSelectChange = function (event) {
    const resultParagraph = document.querySelector('#select-result');
    resultParagraph.textContent = `You have chosen: ${event.target.value}`;
}


// Complete the callback so that it updates the paragraph text below the form to be "Your name:" followed by the first and second names submitted by the form.

  const handleFormSubmit = function (event) {
    event.preventDefault();
    // console.log(event.target.first_name.value);
    const resultParagraph = document.querySelector('#form-result');
    resultParagraph.textContent = `Your name: ${event.target.first_name.value} ${event.target.last_name.value}`;

  };


