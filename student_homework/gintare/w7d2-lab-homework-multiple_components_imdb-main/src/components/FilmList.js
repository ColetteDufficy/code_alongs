import Film from "./Film";

const FilmList = ({allFilms}) => {
    const filmNodes = allFilms.map((film) => {
        return <Film key = {film.id} filmObj = {film.name}/>
    });

    return (
        <>
            <ul>{filmNodes}</ul>
        </>
    );


}

export default FilmList;