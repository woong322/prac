/*
    What is AJAX?
    -Asysnchronous JavaScript and XML
    -It's a series of steps that will allow JS to perform tasks asychronously

    What is asynchronous?
    -it means "non blocking"
    -a task that can be performed concurrently
    -it won't stop other threads from functioning at their own pace

    (btw, we'll be using JSON)
*/


window.onload = function(){
    //window.onload allows you to give the window itself a callback function to trigger when the window has completed
    //  its loading process

    // let myButton = document.getElementById('pokeSubmit')
    // myButton.addEventListener('click', getPoke);

    //OR

    document
        .getElementById('pokeSubmit')
        .addEventListener('click', getPoke);


        /*
            in your project 1 you'll do something like this
        
            triggerMyInitialAjaxRequest() 
                                    which triggers the url:
                                        localhost:8080/api/getUserFromCurrentSession
        */
}

    //<-----NOTICE that we made the function itself asynchronous
async function getPoke(){
    //console.log("in getPoke callback function");

    //extract the input from the user
    let pokeId = document.getElementById('pokeId').value;
    //console.log(pokeId);


    /*
        We're going to be using the Async-Await functionality to perform an AJAX request

    */

    //"await" is used in front of a promise, and will pause the function's logic until the promise has returned
    //   hover over "fetch" in VS code to see the return type of fetch is a promise
   const responsePayload = await fetch('https://pokeapi.co/api/v2/pokemon/'+pokeId);

   //await setTimeout(()=>{console.log("in timeout callback")}, 4000);

   console.log("in async function");

   //"await" is used in front of a promise, and will pause the function's logic until the promise has returned
    //   hover over ".json()" in VS code to see the return type of .json() is a promise
    let ourJSON = await responsePayload.json();

   console.log(ourJSON);

   ourDOMManipulation(ourJSON);


   //if you have errors then you'll have to manually create your own try-catch-finally blocks
   //BUT it'll be eaiser to manager try-catch-finally blocks when you're dealing with many ".then()" in a promise
   
}


function ourDOMManipulation(ourJSON){
    document.getElementById("pokeName").innerText = ourJSON.name;
    document.getElementById("pokedexNumber").innerText = ourJSON.id;
    document.getElementById("pokeImage").setAttribute("src", ourJSON.sprites.front_default);
}