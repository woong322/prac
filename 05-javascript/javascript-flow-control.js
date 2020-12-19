/* CONTROL FLOW

    What is control flow?
    -control flow are a series of functionalities that allow the developers to alter the logical flow of the application
    -normally in an application lines of logic are read top to bottom. Using control flow we can alter the way the lines of logic are ready. We can make lines of code repeat or even be skipped

    Keywords associated with control flow?
    -if, else if, else
    -while, for, do-while, foreach
    -switch
    -break, continue
    -"?" and the ternary operator
*/





/* BRANCHING flow control 
    Branching logic is similar to a fork in the road. Two or more paths are presented, but only a single path can be executed
*/

//if statements
// if( condition ) { //logic }

function branchingFunction(){
    let num= 88;
    
    if(num>=2){
        console.log("1st");
    }else if(num>4){
        console.log("2nd");
    }else if(num>12){
        console.log("3rd");
    }else{
        console.log("4th");
    }
}

//branchingFunction();


//Switch statements
let myGlobalVar= 8;

function branchingFunctionTwo(){
    let num= 8;
    
    switch(true){
        case 4:
            console.log("1st");
            break;
        case myGlobalVar:
            console.log("2nd");
            break;
        case (4+4):
            console.log("3rd");
            break;
        default:
            console.log("oh noes! :( " );
            break;
    }
}

//branchingFunctionTwo();



//ternary statements
//              (condition) ?   true-value : false-value
let daVariable = (8>10) ? 88: 92;
//console.log(daVariable);

//should we always use ternary instead of using if statements?
let daVariable2 = (funct1() && (funct2() || (7>10) || funct1())) ? 88: funct1()+funct1()+funct2(8)+12;

function funct1(){
    return true;
}

function funct2(stuff){
    return (stuff*2)>5;
}

//the answer is NO....don't always use ternary

/* LOOPING flow control

    -loops will repeat snippets of code
    -iterating through the snippet a controlled number of times.
*/

//while
// while(condition) { //logic }

let loopVar = 4;

while(loopVar>0){
    loopVar--; // loopVar--   is the same as   loopVar=loopVar-1;
    
    /* break vs continue
        -break exits the loop entirely. it stops ALL future iterations
        -continue exits the CURRENT iteration of the loop, then goes to the next iteration of the loop, SO future functionality still triggers
    */
    if(loopVar==2)
        //break;
        continue;

    //console.log(loopVar);

}


//do-while loop
let loop2Var = false;

do{
    //console.log("do while");
}while(loop2Var) //the condition is false


//for loops
// for(assignment; condition; assignment)
// which represents
// for(initial state; condition; incrementation)
for(let i=0; i<5; i++){ // i++   same as i=i+1;
    //console.log(i);
}


console.log("\n\n\n\n\n\n\n\n\n\n\n\n");
///more on forloops
let myArray= [88, "Danny Boy", true, "blue", 42, "set, hike!"];
let myObjee= {"element1": 66, "element2": "peanutes!!!! get your peanuts!"}

//"for of" loop
//cycles through elements of an iterable object
for(var temporaryTrevin of myArray){
    console.log(temporaryTrevin);

    //will work for arrays, but will not work for non-iterable objects
    
}

//"for in" loop
//cycles through indices or attributes
for(var temporaryTrevin in myArray){
    // console.log(temporaryTrevin);
    // console.log(myArray[temporaryTrevin]);

    //will work for arrays OR objects, doesn't need iterable
}




////nested loops and break/continue

trevin:  // this is a label
for(let i=0; i<4; i++){
door:
    for(let j=0; j<4; j++){

        if(j==2)
            //break trevin; //broke out of the inner loop
            continue;

        //console.log("i: "+i+"    j: "+j);
    }
}

////flow control w/ single lines vs blocks demo

// let temp = false;

// if(temp)
//     console.log("barnacles");
//     console.log("dolphin noises")

// console.log("end of file");