/* STRINGS

    What is a string?
        -a primitive datatype in JS
        -it represents a series of characters
*/





// how do I create a string?
var name= 'Billy "The Warden"';
var name2= "Aster 'The Raver'";

var name3= "Aster \"The Raver\"";
//tangent: escape characters
//   \n      \s     \t     \'     \"    \\      \b



/*COMPLEX STRINGS

    baccktiks aka template literals
        will evaluate an expression with ${}

    Came to us in ECMAScript6 aka ES6 aka ES2015
    ECMAScript is a standard for all scripting languages. It is create SEPARATELY from JavaScript or any other
    scripting language. It defines what functionalities scripting languages should have.
*/
var tempNum = 25;
var longString = "Printing longString: "+tempNum +
    " and now that we have that...there's more"+
    " and look at this...even more"+
    " a little  more\n"+
    " is anyone "+tempNum+ ' annoyed yet?';

console.log(longString);
console.log("\n\n\n")

var longStringTwo = `Printing longSttringTwo: ${tempNum}
    and now that we have that....we have some more ${tempNum+"apples"}
        and more ${tempNum+18}
            and even more
                is this less annoying?`;
console.log(longStringTwo);