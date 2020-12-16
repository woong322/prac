/* FUNCTIONS

    What is a function?
    -a reusable block of code
    -it performs some service for the rest of the application

    (Note: function vs method. A method is just a function that is attached to an object)

    What is the different between an argument and a parameter?
    -parameters are used to declare WHICH variables a function/method will use.
    -arguments are the actual values passed into a function/method as it is invoked
*/





// how do I declare a function?
function myFunction(){}


//I can also give a function parameters
var myFunctionTwo = function (lePokemans, leMoveSet){
    console.log("The objective best pokemon is: "+lePokemans);
    console.log(leMoveSet);

    // the current return type is "undefined"
}

//how do I invoke (call) a function in JS. YOu invoke using ()
// myFunctionTwo("Starmie", "Surf & Psychic");
// myFunctionTwo("Starmie"); //second argument is "undefined" in this case

//what is the return type of a void method?
//console.log(myFunctionTwo("Starmie", "Surf & Psychic"));


//what happens if I reference a method without parenthesis
//console.log(myFunctionTwo); //prints the function itself


function myFunctionThree(){
    //some logic

    //note: we don't NEED to declare a return type in JS
    return 5;
}

var x = myFunctionThree();
console.log(x);

console.log(myFunctionThree());




