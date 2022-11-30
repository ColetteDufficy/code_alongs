import React from 'react';
import Film from "./Film";
import './FilmList.css';


const FilmList = ( {allFilms} ) => {

    // map round the allComments array
    const filmNodes = allFilms.map( (film)  => {
        return <Film key = {film.id}     filmObj = {film}/>
    });


    return (
        <div className="film-list">
        <ul>
            {filmNodes}
        </ul>
        </div>
    );
}

export default FilmList;