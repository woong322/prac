/*
    REST operator (Rest Parameters aka varargs)
    The "..." operator is the rest operator

    It allows us to input a variable number of arguments into a function.
    The function will then pack the variables into an array. And the "rest variable" must be the final
    variable in the parameter list.

*/

function restFunction(firstElement, ...myElements){

    console.log(firstElement);
    console.log(myElements);
}

//restFunction("Island", "Forest", "Plains", "Swamp", "Mountain");




/*
NOW....let's talk about 

SPREAD OPERATOR

"its like peanut butter" -Venessa 2020

*/

let alphab = ["a", "b", "c"];
let colors = ["blue", "green", "black", "white", "red"];

//this can be burdensome
//spreadDemoFunction(colors[0], colors[1], colors[2], colors[3], colors[4]);

//using the spread operator
spreadDemoFunction(...colors);

//let newArray = [alphab[0], alpha[1], alpha[0],colors[0], colors[1], colors[2], colors[3], colors[4]];
let newArray = [...alphab, ...colors];
console.log(newArray)

function spreadDemoFunction(element1, element2, element3, element4,element5){
    console.log("from the function:",element1,element2,element3,element4, element5);
}




/*
SPREAD VS REST OPERATOR

Rest operator allows a function to accept a variable number of arguments. It takes
elements and PACKAGES them into a SINGLE array.

Spread operator allows an iterable object to be separated into distinct elements. It allows
you to UNPACKAGE an array.
*/