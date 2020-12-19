

function myButtonClickFunc(){
    console.log("button clicked!!!!!!! We're inside of the JS file!");
    
}



//////////DYNAMICALLY create events
let buttonOne = document.getElementById('daButton');

/*
        .addEventListener( eventString, callbackFunction, ?optional? capturingBoolean);
*/
buttonOne.addEventListener('click', myDynamicFunction);


function myDynamicFunction(eve){
    console.log('the dynamic event has fired!');
    console.log(eve); //this argument is the event information
        //it contains all the information you could possibly need about the state of the dom
        //when the event triggered

    console.log(eve.ctrlKey);
    console.log("client-y"+eve.clientY); //page's reference point
    console.log("client-x"+eve.clientX);
    console.log("offset-y"+eve.offsetY);  //button's reference point
    console.log("offset-x"+eve.offsetX);
}



/*
    THERE ARE MANY TYPES OF EVENETS IN JS:

    onsubmit, onchange, click, dblclick, mouseup, mousedown, mouseenter,
    mouseleave, mouseout, mouseover, mousemove, and more

    (mouseover includes children elements, mouseenter doesn't)
    (same with mouseout and mouseleave respectively)

    there is also:
    keyup, keydown, keypress, cut, paste, change(statechange), submit, etc
*/




///demo of a slightly more complex event
let body = document.querySelector('body');
body.addEventListener('mousemove', myComplexFunc);

function myComplexFunc(eve){
    console.log(eve.type);
    body.style.backgroundColor="rgb("+eve.offsetX+", "+eve.offsetY+", 40)";
}