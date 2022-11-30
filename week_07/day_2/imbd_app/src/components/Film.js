import './Film.css'

const Film = ({ filmObj }) => {
    // filmObj comes from FilmList.js

    return (
        <li className="film-item">
        <a href={filmObj.url}>{filmObj.name}</a>
        </li>
        );
}

export default Film;