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


///////////////////////////////////////////
/*
    ARRAY METHODS
*/
let myTestArray = ["chicken", "applebees", "buffalo", "spaghetti", "booze"];


/*
POP
removes the last element from array, then returns the removed element
*/
// console.log(myTestArray.pop());
// console.log(myTestArray);

/*
shift
removes the first element from array, then returns the removed element
*/
// console.log(myTestArray.shift());
// console.log(myTestArray);

/*
push
adds element to the end of the array, then returns the size of the new array
*/
// console.log(myTestArray.push("carbadahydrates"));
// console.log(myTestArray);

/*
unshift
adds element to the start of the array, then returns the size of the new array
*/
// console.log(myTestArray.unshift("thanksgiving dressing"));
// console.log(myTestArray);

/*
splice
splice removes elements at a given index, optionally it then inserts new values
into the array at a given index, then resizes the array

splice(startingIndex, howManyToDelete, ...optional-elements)
*/
// console.log(myTestArray);
//console.log(myTestArray.splice(2,1, "booze aint foods"));
//console.log(myTestArray.splice(2,1));
// console.log(myTestArray.splice(2)); //first indexx inclusive
// console.log(myTestArray);

/*
slice
slice returns a subarray based on an index provided
(doesn't modify original array)
*/
// console.log(myTestArray);
//console.log(myTestArray.slice(2));
// console.log(myTestArray.slice(2,4)); //first index inclusive, second index exclusive
// console.log(myTestArray);


////////////////////////////////////////////
/*
ITERATIVE ARRAY FUNCTIONS
*/


/*
for each
executes logic on each element of an array; in short, it iterates through the array to perform logic
*/
let forEachArray = ["chicken", "applebees", "buffalo", "spaghetti", "booze"];

forEachArray.forEach(
    (myValue, myIndex, myArray) =>{
        // console.log("current iteration's value:", myValue);
        // console.log("current iteration's index:", myIndex);
        // console.log("current iteration's array:", myArray);
        
        //myArray[myIndex]= myValue +"hello";
    }
);


/*
map
creates a new array by performing a callback function on each element of the original array
the return of the map callback function will be the new value in the same position of the new array
*/
let mapArray = [7, 8, 9];
let newMapArray = mapArray.map(
        (myValue, myIndex, myArray) =>{
            return myValue*2;
        }
    );
// console.log(newMapArray); // [14, 16, 18]
// console.log(mapArray); //doesn't change the original array


/*
filter
creates a new sub array with elements that pass a "test"
*/
let filterArray = [55, 10, 88, 15];
let newFilterArray = filterArray.filter(
    (myValue, myIndex, myArray) =>{
        //return a boolean value, anything true will appear the new array, anything false will not
        // if(myValue>10)
        // return true;
        // else
        // return false;

        //return myValue>25;
        return myValue*0;
    }
);
// console.log(newFilterArray);
// console.log(filterArray);


/*
some
searches each element of the array to see if ANY of the elements pass a "test". If even a single
element passes the test, then some() returns true. Else it returns false.

note: every() is a similar array method, but it needs to check to make sure EVERY element passes the "test"

*/
let someArray = [5, 8, 10, 12];
let newSomeArray= someArray.some(
    (myValue, myIndex, myArray) =>{
        return myValue>11;
    }
);
// console.log(newSomeArray);
// console.log(someArray);


/*
reduce

reduce will skip over the first index, and start with the second index.
also that first myTotal will contain the value of the first index's value (if no initial value)
*/
let reduceArray = [10, 20, 60, 10];
let newReduceArray= reduceArray.reduce(
    (myTotal, myValue, myIndex, myArray) =>{
        return myTotal+ myValue;
    }
);
// console.log(newReduceArray);
// console.log(reduceArray);



let reduceArrayTWO = [" The", " big", " bad", " wolf"];
let newReduceArrayTWO= reduceArrayTWO.reduce(
    (myTotal, myValue, myIndex, myArray) =>{
        //you could work with objects as well
        //in which case you may not be ADDING th objects
        //  you'd maybe be adding attribute dynaimically or something

        
        return {"attr1": "value1"};

        //return myTotal+ myValue;
    }
);
console.log(newReduceArrayTWO);
console.log(reduceArrayTWO);





