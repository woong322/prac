/*
    A promises is an asynchronous process that will wait for a response from some secondary process,
    then trigger "success" logic if the secondary process returned correctly OR it will trigger
    some "failure" logic if the secondary process returned incorrectly
*/

let mySecondaryProcessReturnBoolean = true;
let myGlobalState = 25;


let myCustomPromise = new Promise(
    function (resolvingCallback, rejectingCallback){
        if(mySecondaryProcessReturnBoolean){
            resolvingCallback('process RESOLVED!!!!!');
        }else{
            rejectingCallback('process REJECTED......');
        }
    }
);

//the ".then()" function triggers the promise's functionality.
//myCustomPromise.then(myResolver, myRejection);
//myCustomPromise.then(myResolverTWO, myRejection); //the rejection logic will only work for THIS ".then()"

//////you can also use the ".catch()" function to declare your rejection logic
// myCustomPromise
//     .then(myResolver)
//     .catch(myRejection)   //the catch block will function for all ".then()"s above
//     .finally(()=>{console.log("in the finally block")});


/////you can also chain promises....because a promise returns another promise
myCustomPromise.then(myResolver).then(myResolverTWO).then(myResolver).then(myResolverTWO);




function myResolver(myVar){
    console.log("Inside Resolver. This is the promise's message: "+ myVar);
    return ++myGlobalState;
}

function myRejection(myVar){
    console.log("Inside Rejection. This is the promise's message: "+ myVar);
}


function myResolverTWO(myVar){
    console.log("Inside Resolver TWO. This is the promise's message: "+ myVar);
    return "In second resolver function";
}