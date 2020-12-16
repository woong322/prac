/* USE STRICT
    -"use strict" is used to stop devs from declaring variables WITHOUT using "var" or "let" or "const"
*/
"use strict";


/*
    SCOPES in JavaScript

    What is a scope?
        -the memory space where a variable exists
        -it has NOTHING to do with permissions, like access modifiers
    
    What scopes does JavaScript support?
    -global scope: the variable/entity can be accessed by everything
    -function scope: only accessible within the specific function
    -block scope: only accessible within the block it is declare


    How do we declare a variable in JS?
    -"var"  only enforces the "global" and "function" scopes
    -"let" enforces all 3
    -"const"  enforces all 3, constant doesn't allow the value to be reassigned (immutable now)
*/


// var myGlobalScope = 'global scope var';
let myGlobalScope = 'global scope var';

//can I access my global variable from the global scope?
//console.log(myGlobalScope); //is possible

//can I access my function variable from the global scope?
//console.log(myFunctionScope); //NOT possible

//can I access my block variable from the global scope?
//console.log(myBlockScope); //NOT possible

//can I access my randomVar in this scope?
// console.log("global scope: "+myVariableWithoutVarOrLetOrConst);


///////////////////////////////////////////////
function scopeFunction(){
    // var myFunctionScope = 'function scope var';
    let myFunctionScope = 'function scope var';

    //can I access my global variable from the function scope?
    //console.log(myGlobalScope); //is possible

    //can I access my function variable from the function scope?
    //console.log(myFunctionScope); //is possible

    if(true){
        // var myBlockScope = 'block scope var';
        let myBlockScope = 'block scope var';

        //myVariableWithoutVarOrLetOrConst= "randomVar"; //"use strict" stops this from happening

        //can I access my global variable from the block scope?
        //console.log(myGlobalScope); //is possible

        //can I access my function variable from the block scope?
        //console.log(myFunctionScope); //is possible

        //can I access my block variable from the block scope?
        //console.log(myBlockScope); //is possible

        //can I access my randomVar in this scope?
        //console.log("block scope: "+myVariableWithoutVarOrLetOrConst);
    }

    //can I access my block variable from the function scope?
    //console.log(myBlockScope); //NOT possible, assuming we're using "let" not "var"

    //can I access my randomVar in this scope?
    //console.log("function scope: "+myVariableWithoutVarOrLetOrConst);
}

scopeFunction();

//can I access my randomVar in this scope?
//console.log("global scope: "+myVariableWithoutVarOrLetOrConst);


//let myConstExample = "15";
const myConstExample = "15";
//myConstExample= "25"; //no longer possible
//console.log(myConstExample);



/*
    IS MAKING EVERY VARIABLE GLOBAL A GOOD PRACTICE?

    Try to organize your global members into a single object if possible
*/
let mySPECIFICGlobalObject={
    //dynamically add global variables to a single object for organization
};
//mySPECIFICGlobalObject.mySimilarVariableName

function globalStateCreater(){
    mySPECIFICGlobalObject.newAttribute = "new value";
}



/*
    VARIABLES WITH SAME NAME (but different scopes)

    -variables in a higherscope will be shadowed, meaning tha tthey are more difficult to access.
    -using the variable name will access the "most immediate" scope's version of the variable
*/
let myVariable = "Barnacles";
let myVariable2= "BarnaclesAgain";

function myFunc(myVariable){
    myVariable= "Dolphin Noise";
    console.log(myVariable);
}

//myFunc("new entry");

//console.log(myVariable);



/* ENTITIES WITH THE SAME NAME AND THE SAME SCOPE */

function entityFunction(){
    console.log("1st function");
}


function entityFunction(){
    console.log("2nd function");
}


entityFunction(); //inshort the first function is overridden

//there is a window object inside the javascript "global scope". Functions will be created inside of the window object
//      using their names as their variableNames. SO, when you create a second function with the same name, you're
//      you're essentially just reassigning the variable



