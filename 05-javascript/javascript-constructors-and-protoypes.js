//console.log("in prototype file");



let myObj = {
    "myAttr1": "mine",
    "myAttr2": 5
}

//console.log(myObj);

function SuperHuman(name, superpower){
    this.name= name;
    this.superpower = superpower;
    // this.useSuperpower = function (){
    //     console.log("Activate: "+this.superpower);
    // }

    //console.log("in superhuman function");
    //console.log(this.superpower);
}

//note the function's return type is undefined
//console.log(SuperHuman("Mars", "Sandstorm"));

///A function is DEFINITELY an object
//SuperHuman.newAttribute = "new value";
//console.log(SuperHuman.newAttribute); //prints "new value"
//console.log(SuperHuman.superpower);

//let's add a method to the constructor's prototype
//
SuperHuman.prototype.useSuperpower = function (){
        console.log("Activate: "+this.superpower);
    };


//we can use this function as a constructor, despite the return type being undefined
//https://www.codeproject.com/KB/scripting/887551/PrototypalInheritance__1_.jpg
let appleJ = new SuperHuman("Apple Jupiter", "Flesh Fruit");
let pepperJ = new SuperHuman("Pepper Jupiter", "Drowsy Fist");

console.log(appleJ);
console.log(pepperJ);

//
//appleJ.useSuperpower();
//pepperJ.useSuperpower();

//console.log(SuperHuman);


//////////////////////////LET'S SEE IF WE CAN USE PROTOTYPING TO IMPLEMENT INHERITANCE
function SuperVillain(name, superpower, bounty){

    /*
            SuperHuman.call()          //call(new "this" reference frame, arg1, arg2, argN);
            SuperHuman.apply()          //apply(new "this" reference frame, [arg1, arg2, argN]);
            .bind()
    */

    SuperHuman.call(this, name, superpower);
    this.bounty= bounty;
}

//we want to take a snapshot of SuperHuman's prototype and copy it into our prototype
SuperVillain.prototype = Object.create(SuperHuman.prototype);

let gingerJ = new SuperVillain("Ginger Jupiter", "Bioluminescent Moss", 200000);

console.log(gingerJ);








