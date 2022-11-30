import CommentList from "../components/CommentList";
import CommentForm from "../components/CommentForm";
import {useState} from 'react';


const CommentBox = () => {
    // create the comments data in State
    const [comments, setComments] = useState([
        {id: 1, author: "Rick", text: "React is awesome!"},
        {id: 2, author: "Val", text: "Rails is awesome!"},
        {id: 3, author: "Jay", text: "Functions are awesome!"},
        {id: 4, author: "Churchill", text: "JavaScript is awesome!"}
    ]);

    // will get passed kin a newComment to add
    const addComment = (newComment) => {
        // we're not using a db, so we ctrate the id number by using the len method
        newComment.id = comments.length + 1;
        //clone the exisiting comments and add the next one too
        const updatedComments = [newComment, ...comments];
        // update the current State by taking in the new one 
        setComments(updatedComments);
    }
     
    return(
        <>
        {/* Pass the Comments to the List */}
        <CommentList 
        allComments={comments} 
        title = "the Title"/>
        {/* allComments is the props, and the second comments is the State that we passed down from above */}
        {/* adding a prop to CommentForm called addcomment */}
        <CommentForm addComment = {addComment}/>
        </>
    );

}

export default CommentBox;