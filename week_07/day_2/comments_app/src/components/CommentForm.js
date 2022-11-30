import React, { useState } from 'react';


const CommentForm = ({ addComment }) => {
// ------------ set up the state ------------
const [author, setAuthor] = useState("");
const [text, setText] = useState("");

// --------- define every handlers ------------
const handleAuthorChange = (evt) => {
    setAuthor(evt.target.value);
  }

const handleTextChange = (evt) => {
    setText(evt.target.value);
  }

const handleFormSubmit = (evt) => {
    evt.preventDefault();
    if(!author || !text ) return;
    addComment({
        // the second author here is the State
        author: author,
        text: text
    });
    
    setAuthor("");
    setText("");
  }

return (
<form className="comment-form" onSubmit = {handleFormSubmit}>
  <input
    type="text"
    placeholder="Your name"
    value={author} 
    onChange={handleAuthorChange}	
  />
  <input
    type="text"
    placeholder="Say something..."
    value={text} 
    onChange={handleTextChange}
  />
  <input type="submit" value="Post" />
</form>
    );
}


export default CommentForm;