/*
    DESTRUCTURING ASSIGNMENT

    --makes it possible to unpack values from arrays (or objects) into a different form (usually destinct
        separate variables)
*/


///////////////ARRAY DESTRUCTURING

////////////////destucturing array example 1
let one, two, three, four;

[one, two, three, four] = [5, true, "hola", ["Channeling", 250000]];
// console.log(one, two, three, four);


//////////////destructuring array example 2
let five, six, seven, eight;

[five, six, seven, eight]= quickFunction();
// console.log(five, six, seven, eight);

function quickFunction(){
    return [5, true, "hola", ["Channeling", 250000]];
}


//////////destructuring array example 3
let nine, ten;
[nine, ...ten] = [5, true, "ohayou", "stuff"]; //with rest operator
// console.log(nine, ten);

//////////////destructuring array example 4
//let [ eleven, twelve] = ["fa"]; //twelve is currently undefined
// let [ eleven, twelve=12] = ["fa"]; //twelve is currently 12
let [ eleven, twelve] = ["fa", "so", "la", "ti"]; //"la" and "ti" are thrown away basically
// console.log(eleven, twelve);

///////////////destructing array example 5
//a clever way to flip values tof two variables
[eleven, twelve] = [twelve, eleven];
// console.log(eleven, twelve);

//////////////////destructring array example 6
let [thirteen, , , fourteen] = ["head", "shoulders", "knees", "toes"];
 console.log(thirteen, fourteen);




/////////////////OBJECT DESTRUCTURING

/////////destructing object example1
myVill = {
    name: "Sha",
    superpower: "Ragdoll Voodoo",
    bounty: 140000
}

let {bounty, name} = myVill;
// console.log(name, bounty);

// let {a, b, c} = myVill; //the variables need to have the EXACT SAME NAME as the fields in the object
// console.log(a, b, c);



/////////////destructuring object example2
//you need parenthesis when object destructingAFTER the variables have been declared
myObj = {"attr1": 5, "attr2":"hola"};

let attr1, attr2;
({attr1, attr2} = myObj);
// console.log(attr1, attr2);






/////for example in project 1
/*

   let {name, base_experience}    =    JSON from the poke api
*/

