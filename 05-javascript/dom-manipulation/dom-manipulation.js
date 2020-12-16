//console.log("In dom manipulation separation of concerns file");


/*
    What is the DOM?
    -Document Object Model
    -The DOM is a virtual representation of the HTML page
*/

//console.log(document);
// console.log(document.URL);
// console.log(document.title);
//console.log(document.all);
// console.log(document.links);
// console.log(document.images);
// console.log(document.forms);


/*
even though this WILL work....it isn't a stable solution. What happens to a coworker adds an html
element between index 4 and 5?
*/
//document.all[13].innerText="Wait, html elements have mailmen? What the heck?";


///////////GET ELEMENT BY ID
let paraTwo = document.getElementById('para2');

//console.log(paraTwo);

//If you put HTML tags in your string then innerText will display the tags as text
//paraTwo.innerText = "Things are going <b>TERRIBLY WRONG! PANIC</b>!!!";

//If you put HTML tags in your string then innerHTML will actually execute the HTML syntax
//note: subject to HTML injection
//paraTwo.innerHTML = "Things are going <b>TERRIBLY WRONG! PANIC</b>!!!";

///////////GET ELEMENT BY CLASSNAME
let muffins = document.getElementsByClassName("headers");

// console.log(muffins);

// for(let i=0; i<muffins.length; i++){
//     muffins[i].innerHTML = "blueberry muffins: "+i;
//     muffins[i].style.fontWeight = "normal"; //normal or bold or a numeric value
// }


///////////GET ELEMENT BY TAGNAME
//getElementByTagName("")
//basically, the same as elements by classname




///////////////QUERY SELECTORS//////////////////////////////

let selection = document.querySelector("#para2");

//console.log(selection);
selection.innerText= "blahblahblah";

//only obtains the FIRST element that fits the description
//let selection2 = document.querySelector(".para");

//the "ALL" gives the entire list of elementss
let selection2 = document.querySelectorAll(".para");
//console.log(selection2);



//more with query selectors
/*
    query selector has some complex queries that you can run

    stuff like: last-child, first-child, nth-child(n)
*/

let selection3 = document.querySelector('.para:nth-child(2)');
//selection3.innerText="nth child";










/*
    NAVIGATING THE DOCUMENT

    you can also do stuff like:

    .parentNode / .parentElement
    .childNodes / .childElements
    .firstChild / .lastChild
    .firstElementChild / lastElementChild

    also, next and previous siblings...and the list go on

    example syntax:   selection.parentElement
*/




//note: we've only seen the R and U   of CRUD....let's look at the C next


/////////////CREATE ELEMENTS DYNAMICALLY//////////////
//step1: creating our new element
let newDiv = document.createElement("div");


//step2: populate our new element with attributes
newDiv.id="newestDiv";
newDiv.setAttribute("title", "new div, who dis?");

//step3: create a text node, then append to our new div element
let divText = document.createTextNode('new text node information');
newDiv.appendChild(divText);

//step4: appending our new div element onto an existing element that is currently being displayed
let newSelection = document.querySelector("#para1");
newSelection.appendChild(newDiv);

console.log(newDiv);


//we can also DELETE elements from the DOM
///////removeAttribute, removeChild, remove



