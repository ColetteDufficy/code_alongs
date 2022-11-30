const Comment = ({ commentObj }) => {
    // commentObj comes from CommentList.js

    return (
        <li>{commentObj.author}: {commentObj.text}</li>
        // <li>{commentObj.id}) {commentObj.author}: {commentObj.text}</li>
        // will display:  4) Churchill: JavaScript is awesome!
        );

}

export default Comment;