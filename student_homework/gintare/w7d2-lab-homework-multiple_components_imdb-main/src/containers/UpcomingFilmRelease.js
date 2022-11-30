
import ViewMore from '../components/ViewMore';
import FilmList from '../components/FilmList';
import {useState} from 'react';


const UpcomingFilmRelease = () => {
    const allFilms = [
    {
        id: 1,
        name: "Spider-Man: Into the Spider-Verse",
        url: "https://www.imdb.com/title/tt4633694/?ref_=rlm"
    },
    {
        id: 2,
        name: "Life Itself",
        url: "https://www.imdb.com/title/tt5989218/?ref_=rlm"
    },
    {
        id: 3,
        name: "Mary Queen of Scots",
        url: "https://www.imdb.com/title/tt2328900/?ref_=rlm"
    },
    {
        id: 4,
        name: "The Lego Movie 2: The Second Part", url: "https://www.imdb.com/title/tt3513498/?ref_=rlm"
    },
    {
        id: 5,
        name: "Captain Marvel",
        url: "https://www.imdb.com/title/tt4154664/?ref_=rlm"
    }
]

const [ films, setFilms] = useState(allFilms);

    return (
        <>
            <h1>Upcoming Film releases for UK</h1>
            <FilmList allFilms={films} />
            <ViewMore />
        </>
    );
 
    
}

export default UpcomingFilmRelease;