import Comment from "./Comment";
import "./CommentList.css";


// we need create a parameter in the function CommentList, that is going to capture the function
// we can pass dowm mutilple props
//  were going to descructure and pull out the comments
// {allComments} is the object
// 'title' is a prop, and it as shown as deconstructed
const CommentList = ( {allComments, title} ) => {

    // map round the allComments array
    const commentNodes = allComments.map( (comment)  => {
        // return <li key = {comment.id}> {comment.author} {comment.text} </li>
        return <Comment key = {comment.id}     commentObj = {comment}/>
    });


    return (
        <>
        <h2>{title}</h2>
        {/* <Comment/> */}
        <ul>
            {commentNodes}
        </ul>
        </>
    );
}

export default CommentList;