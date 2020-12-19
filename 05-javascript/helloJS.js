//console.log("Separation of concerns activated!!!!");

//This is a comment.

/*
This is a multiline comment (or comment block)
*/

/*
    NOW ON THE ACTUAL TOPIC!!!

    What ....is the blue blazes is JavaScript?
        Is a proramming/scripting language originally designed to provide functionality to
        web pages; effectively making those webpages dynamic. It allows website clients to run
        code from THEIR machines instead of always returing to the server for a new
        view/html containing new information/calculations


    What is a scripting language?
        It's a snippet of code that automates some functionality. A script is NOT a complete
        application/program, it's just a snippet of code. It is run line by line.


    Originally, JavaScript was only interpreted by the browser. (Chrom uses the V8 engine.
        Firefox uses the SpiderMonkey engine.)

    HOWEVER, JavaScript became EXTREMELY popular. Users demanded to use JavaScript outside of the
        browser. So...eventually someone ripped out Chrome's V8 engine and wrapped it in a C++
        shell to create a JS runtime environment. The name of this environment is called NodeJS.

        So nowadays JavaScript can be used to create entire fullstack applications.

    Features of JS:
        -loosely typed (a variable can hold ANY datatype)
        -it's a dynamic language (you can heavily modify the structures during runtime)
        -It has a JIT compiler (Just In Time)
            >js is not compiled, it is interpreted
        -originally, built for DOM manipulation, but it has evolved
            > DOM = document object model
            >the DOM is a virtual representation of a HTML page
        -generally, interpreted by the browser or nodejs


        I can run a JS file using:
        >  "node [filepath]" in the terminal
        OR
        > using an html page that has the JS file linked

*/

//what is console log?
// it is a basica functionality in JavaScrpt (JS) that prints text to the dev console in the browser
// console.log("hello world!");

//do you NEED a semicolon in JS? no. you don't.
//is it a good idea? yes. By conventio AND keep in mind that even JS can make a mistake.
// console.log("hello world again~!")
// console.log('hello world one more time here')
// console.log(`I can even make a string using backtiks`);


/*
        DATATYPES IN JAVASCRIPT

        There are primitives and reference types
*/



/*
PRIMITIVE DATATYPES in JavaScript

-boolean
-number
-string
-null
-undefined
(in the latest ECMAScript there are BigInt & Symbols, etc)

ECMAScript is a standardization of functionalites that scripting languages
should have. Various versions of ECMAScript add different functionalities.
   e.g. it can be denoted like "ES6" or "ES2015" or "ECMAScript2015"


we can use "var" in order to declare variables
*/

var num = 5; //number
//console.log(num);
//num = "changing the datatype on the fly";
//console.log(num);

var numTwo; //undefined

//numThree  //undeclared

var name= 'Billy "The Warden"'; //string
var nameTwo= "Billy 'The Warden'";//also a string

var isApproved = false; //boolean, can be true or false

var noMansLand = undefined; //undefined
        //undefined is essentially a SYSTEM DEFINED "null" value

var nothing = null;
        //null is a USER DEFINED "null" value

//console.log(console.log("hello")); //prints "hello" then "undefined"



/*
        REFERENCE DATATYPES in JavaScript

        -object
        -array
        -functions
*/

//how do we create an object?
var exampleObject = { }; //this is an empty object, but still an object

//how do we create an array?
var exampleArray = [ ]; //this is an empty array, bt still an array

//how do we create a function?
function exampleFunction() {
    //function logic here
    console.log("in first func");
}
// exampleFunction(); //this is how you invoke a function

//there is ANOTHER WAY to create a function while putting it into a variable
var exampleFunctionAgain = function (myVar) { console.log("in second func: "+myVar)}
// exampleFunctionAgain("random input");

//there is YET ANOTHER WAY to create a function USING a notation called "arrow notation"
var exampleFunctionAThirdTime = (myOtherVar) => { console.log("in third func: "+myOtherVar)}
// exampleFunctionAThirdTime("other input");



/*
    TYPEOF operator

    -typeof returns a string that descibes the datatype of the argument
*/

// console.log(typeof(num));
// console.log(typeof(numTwo)); //print "undefined"
// console.log(typeof(name));
// console.log(typeof(isApproved));
// console.log(typeof(noMansLand));
// console.log(typeof(nothing)); //prints "object"

// console.log(typeof(exampleObject));
// console.log(typeof(exampleArray)); //prints "object"
// console.log(typeof(exampleFunction));



/*
    CONVERTING DATATYPES
        -am I able to convert one datatypes to another?
        the answer is "yes"
*/

// console.log(typeof(num.toString())); //toString changes the number to a string
// console.log(typeof( parseInt("55"))); //parseInt changes a string to a number



/*
    STRING TYPE COERCION

    What is type coercion?
    -it is the automatic conversion of a datatype to another dattype
    -it triggers in a variety of situations

    (Remember the ASCII table and Precedence order table for a moment)
    */

// console.log(5+10+"stuff"+9+7);
// console.log(typeof(5+10+"stuff"+9+7));

// console.log("Trevin".toLowerCase() =="trevin");
// console.log(String.fromCharCode(97));



/*
    COMPARISON operators ==, ===

    a double equals, or comparison, checks if the two values are equal then produces
        a true or false value
        (it WILL use type coercion)
    
    a triple equals, or strict comparison, checks if the two values are equal then produces
        a true or false value
        (it will NOT use type coercion)
*/
// console.log(5=="5");
// console.log(5==="5");
//console.log(0==false);



/* NUMERIC PRECISION IN JAVASCRIPT*/

// console.log(1.1+1);//prints '2.2'
// console.log(1.1+1.3); //prints '2.40000000000004', instead of 2.4

// var precision=1.1+1.3;
// console.log(precision.toFixed(2)); //prints 2.40,  toFixed(n) rounds to the n places
//     //note: toFixed() returns a string value, so you may need to do a conversion later



/* MORE ON DATATYPES IN JAVASCRIPT*/
//console.log(-6/0); //prints '-Infinity'
//console.log(typeof(-6/0)); //number

//console.log(Infinity==Infinity);

//console.log(0/0); //Not A Number (NaN)
console.log(undefined+5); //Not A Number (NaN)

//console.log(typeof(0/0)); //prints "number"...Not A Number...is a freakin' number? What?
console.log(NaN==NaN);  //false
console.log(NaN===NaN); //false
console.log(isNaN(NaN)); //print true

console.log(isFinite(Infinity)); //there is also a "isFinite"



