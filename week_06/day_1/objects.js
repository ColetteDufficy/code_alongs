var movie = { 
    title: 'It\'s a Wonderful Life',
    year: 1946,
    language: 'Spanish'
  };
  
// console.log('movie:', movie);

// var title = movie.title;
// console.log('title:', title);

// movie.cast = ['James Stewart', 'Donna Reed'];
// console.log('movie:', movie);


movie.language = 'English'; //using a . to add a property
console.log('movie: ', movie); 

movie['subtitle-language'] = 'German'; // note the [] brackets ratehr than the dot, becasue of the dash in 'subtitle-language'
console.log('movie:', movie);


// another reasonto use [] brackets below:
var propertyToAccess = 'subtitle-language'; // NEW
movie[propertyToAccess] = 'German'; // MODIFIED
console.log('subtitle language:', movie[propertyToAccess]);
// -> subtitle language: German
console.log('subtitle language:', movie.propertyToAccess);
// -> subtitle language: undefined

delete movie.year;
movie.ratings = {
    critic: 94,
    audience: 95
  };
  
console.log('movie: ', movie); 

var audienceRating = movie.ratings.audience;
console.log('audience rating:', audienceRating);
console.log('audience rating a different way:', movie.ratings.critic);


for (var key in movie) {
    var value = movie[key];
    console.log(`The ${key} is ${value}`);
  
    // -> The title is It's a Wonderful life
    // -> The language is French
    // -> The cast is James Stewart,Donna Reed
    // -> The subtitle-language is German
    // -> The ratings is [object Object]
  }

var keys = Object.keys(movie)
console.log('keys:', keys);


