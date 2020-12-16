/*
    FUN WITH FUNCTIONS
*/






/*What is an anonymous function
    a function without a name
*/

var funcHolder = function () {
    console.log("in anony func");
}

//funcHolder();


/*
    What is a callback function?
        -Is a function that is called within another function. In other words, a function that has
        been passed as an argument to another function to be run.
*/

var myVari = 5;

function myCallbackFunction(myParam){
    console.log("calling you back in 10mins: "+myParam);
    myVari=10;
}

function myHigherOrderFunction(daCallback){
    console.log("higher order logic");
    daCallback(15);
}

//myHigherOrderFunction(myCallbackFunction);

//let's try that again
// myHigherOrderFunction(
//     function(otherParam){
//         console.log("NEW anony function: "+otherParam);
//     }
// );



/*
    What is IIFE?
    -Immediately Invoked Function Expression  (aka Self-invoking function)
*/


// (function () {
//     console.log("in IIFE function");
//     //this is SIMILAR TO an initializer block
//     //in short, because you can't reference the function ever again, you need to trigger
//     // it immediately when seen.
// })();

/*
    What is a NESTED FUNCTION?
     a function inside of another function
*/

function birdNest(){
    var firstVar = 7;

    babyBird(); // this is a concept called "hoisting" (use moving to a apartment to describe hoisting)

    function babyBird(){
        var secondVar=15;
        //notice, inner function has access to outer function's scope
        console.log("babyBird(): "+ ++firstVar);
    }

    babyBird();
    //babyBird();
}

// birdNest();
// birdNest();
// birdNest();
// birdNest();



/*
    CLOSURE
    -Closures are a way to create encapsulation in JS.
    -A closure is a self invoking anonymous function that returns an inner function. The inner
    function has access to the outer function's scope, but NOTHING else in your program does.
*/
let foo = (function(){
    //console.log("in outer function");
    let bar=0;
    return function(){ // <----foo is assigned to this function here
        //console.log("in inner function");
        return ++bar;
    }
})();


// console.log(foo());
// console.log(foo());
// console.log(foo());
// console.log(foo());

//another example of closure
let moreOnClosure = (function(){
    let bar=0;
    return [
        function myIncrementor(){ ++bar;},
        function myGetter(){return bar;},
        function mySetter(setterValue){bar=setterValue;}
    ];
})();

// console.log((moreOnClosure[1])());
// (moreOnClosure[0])();
// (moreOnClosure[0])();
// console.log((moreOnClosure[1])());
// (moreOnClosure[2])(50);
// console.log((moreOnClosure[1])());



/* ARROW NOTATION (function shorthand notation)
    annother way to create a function

    (a,b) => a+b; //this will return a+b implicitly
    OR
    (a, b) => {a+b; console.log(a+b);} //no implicit return
    OR
    a => {console.log(a)} // no implicit return
    OR
    () => {console.log("stuff");}

*/
let arrowExample = numba => {
    console.log("numba "+numba);
    console.log("Abigail");
}

arrowExample(5);
console.log(arrowExample(5));

let arrowExampleTwo = (param, paren) => param + paren;
console.log(arrowExampleTwo(5, 77));