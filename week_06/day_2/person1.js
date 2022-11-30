// ****VERSION 1****
// const Person1 = function () {
// }

// const shaggy1 = new Person1();
// console.log('shaggy:', shaggy1)
// Person is not defined


// ****VERSION 2****
// const Person = function () {
//     console.log('this:', this); 
//     // -> this: Person {}
//   }

//   const shaggy = new Person();
//   console.log('shaggy:', shaggy);
//   // -> shaggy: Person {}
// THE ABOVE TWO ACONSOLE.LOGS ARE THE SAME OBJECTS!!


// ****VERSION 3****
// const Person = function () {
// this.name = 'Shaggy Rogers'; 
// }

// const shaggy = new Person();
// console.log('name:', shaggy.name); 
// // -> name: Shaggy Rogers



const Person = function (name) {
    this.name = name;
    
    // We can see these object's prototypes using Object.getPrototypeOf.
    // this.greet = function () { // this was deleted and replace with the bwlow line:
    Person.prototype.greet = function () { // NEW
      console.log(`Hi! My name is ${ this.name }`);
    }
  }
  
  const shaggy = new Person('Shaggy Rogers');
  shaggy.greet(); // NEW
  // -> Hi! My name is Shaggy Rogers
  

const velma = new Person('Velma Dinkley');
velma.greet();
// -> Hi! My name is Velma Dinkley

console.log('shaggy:', shaggy);
console.log('velma:', velma);
// WAS -> shaggy: { name: 'Shaggy Rogers', greet: [Function] } 
// WAS -> velma: { name: 'Velma Dinkley', greet: [Function] } 
// ****NOW ****
// -> shaggy: { name: 'Shaggy Rogers' }
// -> velma: { name: 'Velma Dinkley' }


// We can see these object's prototypes using Object.getPrototypeOf.
console.log("shaggy's prototype:", Object.getPrototypeOf(shaggy));
console.log("velma's prototype:", Object.getPrototypeOf(velma));
// shaggy's prototype: { greet: [Function (anonymous)] }`
// velma's prototype: { greet: [Function (anonymous)] }`


module.exports = Person;
