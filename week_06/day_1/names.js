var filterNamesByFirstLetter = function (names, letter) {
    var filteredNames = [];
    for (let name of names) {
      if (name[0] === letter) {
        filteredNames.push(name);
      }
    }
    // console.log('name after loop:', name); // NEW **not sure the point is working here????
    return filteredNames
  }
  
  var students = ['Alice', 'Bob', 'Alyssia', 'Artem', 'Babs'];
  var filteredStudents = filterNamesByFirstLetter(students, 'A');
  console.log('filteredStudents:', filteredStudents);


  var pinCode = [0, 0, 0, 0]; // if this line is moved to within the scope of the function then the function will NOT run because the varialble is accessible everywhere
  var secretsFunction = function () {
console.log('pinCode inside secretsFunction:', pinCode);
// -> pinCode inside secretsFunction: [ 0, 0, 0, 0 ]
}
secretsFunction();
console.log('pinCode outside secretsFunction:', pinCode);
// -> ReferenceError: pinCode is not defined




var name = 'Jill'; // NEW
var secretsFunction = function () {
  var pinCode = [0, 0, 0, 0];
  console.log('name inside secretsFunction:', name); // MODIFIED
  // -> name inside secretsFunction: Jill
}

secretsFunction();
console.log('name outside secretsFunction:', name); // MODIFIED
// -> name outside secretsFunction: Jill




let temperature = 30;
if (temperature > 15) {
  let jacket = false;
  var happy = true;
} else {
  let jacket = true;
  var happy = false;
}

// console.log('jacket after if-else blocks:', jacket); --> undefined
console.log('happy after if-else blocks:', happy);

//????????




let calculateEnergy2 = function (mass) {
    const speedOfLight = 299792458;
    return mass * speedOfLight ** 2;
  }
  
  let energyOfMe2 = calculateEnergy2(75);
  console.log('energyOfMe (if I had a mass of 75kg)', energyOfMe2);
  // -> energyOfMe (if I had a mass of 75kg) 6740663840526132000


  
  const calculateEnergy = function (mass) { // MODIFIED
    const speedOfLight = 299792458;
    // speedOfLight++
    return mass * speedOfLight ** 2;
  }
  
  // calculateEnergy = () => 0 // MODIFIED
  const energyOfMe = calculateEnergy(65); // MODIFIED
  console.log('energyOfMe (if I had a mass of 65kg)', energyOfMe);


  const song = {
    title: 'Raspberry Beret',
    artist: 'Prince'
  };
  
  console.log('song before mutation', song);
  song.title = 'When Doves Cry';
  console.log('song after mutation', song);
  
  const songs = [
    song,
    'Happy Birthday',
    'Hey Jude'
  ];
  
  console.log('songs array before mutation', songs);
  songs[1] = 'Call Me Maybe';
  songs.pop();
  console.log('songs array after mutation', songs);