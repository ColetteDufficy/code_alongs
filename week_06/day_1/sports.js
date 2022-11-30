var sports = ['football', 'tennis', 'rugby']; 

var numOfElements = sports.length;
console.log('number of elements: ', numOfElements )

var firstSport = sports[0]
console.log(firstSport)

var secondSport = sports[1]
console.log(secondSport)

sports.push('ice hockey');
console.log(sports)

// sports.pop()
// console.log(sports)

var removedSport = sports.pop(); // MODIFIED
console.log('removed sport:', removedSport); // MODIFIED

console.log('sports:', sports);

sports.unshift('basketball');
console.log(sports);

var removedSport = sports.splice(2, 1);
console.log(sports);

// for (var currentSport of sports) {
//     var uppercasedSport = currentSport.toUpperCase();
//     console.log(uppercasedSport);
//   }

for (var i = 0; i < sports.length; i++) { // for (initialiseCounter; condition; incrementCounter) { }
    // i++  is just  i += 1     is just shorthand for  i = i + 1
    //  i += 2     is just shorthand for  i = i + 2
    var currentSport = sports[i];
    var uppercasedSport = currentSport.toUpperCase();
    console.log(uppercasedSport);
}



