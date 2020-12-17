/*
NOW, LET'S SEE HOW TO USE FETCH WITH A POST METHOD


I started by copying all of the code in "fetch.js" and I"ll modify it slightly to show you how you'd normally use a post
*/




















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

function getPoke(){
    //console.log("in getPoke callback function");

    //extract the input from the user
    let pokeId = document.getElementById('pokeId').value;
    //console.log(pokeId);


    /*
        We're going to be using the fetch API to perform an AJAX request   <-----MODIFIED THIS SECION FOR THE POST EXAMPLE

    */
   let myObj ={
        "name": "myChar",
        "character": ['char1', 'char2', 'char3'],
        "rating": 5.0
    }


   fetch('https://pokeapi.co/api/v2/pokemon/'+pokeId,
        {
            method: 'post',
            'headers': {
                'Content-Type': 'application/json'
            },
            'body': JSON.stringify(myObj)
        }
   )
        .then(
            function(daResponse){
                const convertedResponse = daResponse.json();
                return convertedResponse;
            }
        ).then(
            function(daSecondResponse){
                console.log("Fetch is a thing. We did it.");
                ourDOMManipulation(daSecondResponse);
            }
        )/* .catch(){
            //blabhblahblah
        } */
   
}


function ourDOMManipulation(ourJSON){
    document.getElementById("pokeName").innerText = ourJSON.name;
    document.getElementById("pokedexNumber").innerText = ourJSON.id;
    document.getElementById("pokeImage").setAttribute("src", ourJSON.sprites.front_default);
}