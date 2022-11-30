
// **** Named Function Declarations *****
function sayHello() {
    return 'Hello World!';
  }
//   console.log(sayHello());
// -> Hello undefined!


function sayHello(name) { 
    return `Hello ${name}!`; 
}
console.log('sayHello message:', sayHello('Danielle'));
// -> sayHello message: Hello Danielle!


function sayHello(greeting, name = 'World') { 
    return `${greeting} ${name}!`;
  }
  console.log('sayHello message:', sayHello('Hi', 'Danielle')); 
  // -> sayHello message: Hi Danielle!



// ****** Anonymous Function Expressions ******
  var add = function (firstNumber, secondNumber) {
    return firstNumber + secondNumber;
  }
  console.log('1 + 3 will total:', add(1, 3));
  // -> 1 + 3 with add: 4


//   Declare a named function that takes an array of numbers, and returns the sum, or total, of all of the numbers in the array.
function calculateTotal(numbers) {
    var total = 0;
    for (var number of numbers) {
      total += number;
    }
    return total;
  }
  
  var sum = calculateTotal([1, 2, 3, 4]);
  console.log('Calculate total of numbers:', sum);


// Task 2
var objectHasKey = function (object, searchString) {
    for (var key in object) {
      if (key === searchString) {
        return true;
      }
    }
    return false;
  }
  
  var person = {
    name: 'Wojtek',
    age: 30
  };
  
  var keyIsFound = objectHasKey(person, 'name');
  var keyNotFound = objectHasKey(person, 'email');
  
  console.log('keyIsFound - should be true:', keyIsFound);
  console.log('keyNotFound - should be false:', keyNotFound);



// ***** Arrow Functions*****
//   () => {}
// Arrow functions are always anonymous, they cannot be named. If we want to refer to them later they must be assigned into a variable.

var multiply = (firstNumber, secondNumber) => {
    return firstNumber * secondNumber;
}
console.log('multiply 2 by 5:', multiply(2, 5));
// -> multiply 2 by 5: 10


var multiply = (firstNumber, secondNumber) => firstNumber * secondNumber; // MODIFIED
console.log('multiply 2 by 5:', multiply(2, 5));

