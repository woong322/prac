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
}

function getPoke(){
    //console.log("in getPoke callback function");

    //extract the input from the user
    let pokeId = document.getElementById('pokeId').value;
    //console.log(pokeId);


    /*
        We're going to be usinng the XMLHttpRequest object (aka xhttp) to perform an AJAX request

        STEP 1: create XMLHttpRequest object
            this object allows us to make requests and get back data.
            in short, this is our data retriever object (it calls APIs)
    */
   let xhttp = new XMLHttpRequest();




   /*
        STEP 2: create the callback function for readystate changes

        READY STATES:
            The XMLHttpRequest object has serveral states we need to know about

            state 0:    not initialized
            state 1:    server connection established
            state 2:    request received
            state 3:    processing request
            state 4:    complete, request finished and response is ready
   */
  xhttp.onreadystatechange = function(){ //notice it is not camel case
    //console.log("readyState is changing!");

    if(xhttp.readyState ==4 && xhttp.status==200){
        console.log("readyState is 4");

        let poke = JSON.parse(xhttp.responseText); //there is ALSO a JSON.stringify to do the opposite
        console.log(poke);

        ourDOMManipulation(poke);
    }
  }




   /*
        STEP 3: create and open a connection

        xhttp.open(httpMethod, url);
        OR
        xhttp.open(httpMethod, url, boolean async?) <----default to true for the boolean
   */
  xhttp.open("GET", 'https://pokeapi.co/api/v2/pokemon/'+pokeId);

  //in YOUR project it will look like this:
  //    xhttp.open("GET", 'http://localhost:8080/api/mypath');




   /*
        STEP 4: send the request
   */
  xhttp.send();

}


function ourDOMManipulation(ourJSON){
    document.getElementById("pokeName").innerText = ourJSON.name;
    document.getElementById("pokedexNumber").innerText = ourJSON.id;
    document.getElementById("pokeImage").setAttribute("src", ourJSON.sprites.front_default);
}