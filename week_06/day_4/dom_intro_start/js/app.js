// console.log('app loaded', window);

// const title = document.querySelector('hi');
// title.textContent = 'Javascript says, Hello World';

document.addEventListener('DOMContentLoaded', () => {
    const title = document.querySelector('h1');  
    title.textContent = 'JavaScript says, Hello World';

    const welcomeParagraph = document.querySelector('#welcome-paragraph');
    console.dir(welcomeParagraph);

    // const redElement = document.querySelector('li.red');
    // console.dir(redElement);
    const redListItem = document.querySelector('li.red');
    redListItem.textContent = 'RED!!';
    redListItem.classList.add('bold');


    const allRedElements = document.querySelectorAll('li');
    console.dir(allRedElements);

    const newListItem = document.createElement('li');
    newListItem.textContent = 'Purple';
    newListItem.classList.add('Purple');

    const list = document.querySelector('ul');
    list.appendChild(newListItem);
})