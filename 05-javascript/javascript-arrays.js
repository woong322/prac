/*  ARRAYS

    What is an array?
        -a group of data entries
        -Each data entry has an index associated with it. indeces begin with (0) to (arraySize -1)

 */





// how do we declare an array?
var arrayOne= ['Billy', 'Katherine'];
// remember, JS is loosely typed
var arrayTwo= ['Billy', 'Katherine', 77, false];
//              0           1         2    3

// how do you see all the contents of an array?
//console.log(arrayTwo);



// how do you obtain the length of the array (the # of elements)?
//console.log(arrayTwo.length); // prints "4"



// how do you access elements in an array?
//console.log(arrayTwo[0]); // prints "Billy"

// what if you attempt to access an element that doesn't exist?
//console.log(arrayTwo[50]); // prints "undefined"



// how do you update the value of an array element?
//arrayTwo[2]= 88;
//console.log(arrayTwo[2]); // prints "88"


/// what happens if I attempt to update an element that doesn't exist
arrayTwo[6]="does this work?";
// console.log(arrayTwo);
// console.log(arrayTwo[6]);// prints "does this work?"
// console.log(arrayTwo[5]); //prints "undefined"


//how do I dynamically removed elements from an array?
var arrayDelete =[6, 8, 10, 12];
delete arrayDelete[1];
// console.log(arrayDelete);

// delete arrayDelete[7];
// console.log(arrayDelete); //no arrys


// is it possible to put an array inside of an array?
// YES you may have a 2-dimensional array
var arrayThree= [[6,false], [5,true, true], ["eat", "pray", "love"]];

// in fact, you may have as many dimensions as you'd like
var arrayFour= [[[[],[[],[]]]],[],[]]; // I won't fill in the values becauuse it'll get messy



// Are you able to replace 2nd dimension array with a different array?
var arrayFive= ['Trevin', 'Chester', ['blue', true]];
var arraySix= [true, true, 'water'];
// console.log(arrayFive);

arrayFive[2]=arraySix; // yes, you may
// console.log(arrayFive);

/*
JUST FOR KICKS
*/
// arrayFive[0]=arrayFive;
// console.log(arrayFive);

//EXPERIMENTAL TANGENT: can JS have negative indices?
//arrayFive["-1"] = "hello45";
// arrayFive[-1] = "hello45";
// console.log(arrayFive);