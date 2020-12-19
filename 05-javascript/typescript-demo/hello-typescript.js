//const myQuizFile = require('./quiz');
/*
to transpile typescript into js

tsc *filename.ts*
tsc *filename.ts* -w      <----to run in watchmode
tsc -t es6 *filename.ts* -w
tsc -t es2015 *filename.ts* -w
(es6 or es2015 works)

to stop watchmode you can use "ctrl+c"
*/
console.log("hello typescript world!!!!");
/*
What are the datatypes in TypeScript?
boolean, number, string, undefined, null, object, function, array, void
any, enum, tuple, symbol
*/
let s1 = "hello";
//s1= 5;
// console.log(s1);
/*
Note: even though typescript gives us an error, it will still transpile into JS and as we know....
JS doesn't care about changing datatypes. So the code will still run.

HOWEVER, this is no excuse to ignore the red underlines. the red underlines offers compile time safety.
*/
//BACK TO DATATYPES
let s2; //type: any
let s3; //number
let s30 = 5; //number
let s31 = 10; // number
//you can restict dataypes to a range of possible options. In this case it could be a number, boolean, or string
let s4;
s4 = 5;
s4 = "hello";
//any
let n1;
n1 = 5;
n1 = "stuff";
let n10;
//the following are a bit interchangeable
let v1 = null;
let v2 = null;
let nul2 = undefined;
let un1 = null;
//arrays
let array1 = [2, 3, 4, 5];
// array1[1]="hello";
let array2;
let array3;
//tuple (basically, it's a fixed size and datatype  and order array)
let tuple;
//tuple = [false, 5, "hello"];
tuple = ["hello", false, 5];
var carStates;
(function (carStates) {
    carStates[carStates["OFF"] = 0] = "OFF";
    carStates[carStates["IDLE"] = 1] = "IDLE";
    carStates[carStates["STOPLIGHT"] = 2] = "STOPLIGHT";
    carStates[carStates["ACCEL"] = 3] = "ACCEL";
    carStates[carStates["DRIVING"] = 4] = "DRIVING";
})(carStates || (carStates = {}));
;
let myVar = carStates.ACCEL;
/////////////FUNCTIONS
function myfunc(first, second) {
    //remember, we're now in a strong typed language
    return "hola";
    //return 18;
}
//function myOtherFunc(): void {  //you CAN force it to be void}
function myOtherFunc() {
    //the return type is void by default (hover over the method signature to see it)
    //BUT....if you return any datatype the return type will follow suit.
    //return 5; //return type is void UNTIL you uncomment this line
}
function myfunc3(daVariable) {
    console.log(daVariable);
    console.log(daVariable.name);
}
//notice I am STILL creating an object literal, but it now has a datatype being enforced
// let daCriminal: Criminal = {'name': 'Joker', 'criminalRecord': true, 'minions': 600};
//myfunc3({"centaur": "much yes"});
// myfunc3(daCriminal);
/* CLASSES */
class SuperVillain {
    constructor(name, ability, bounty) {
        this.name = name;
        this.ability = ability;
        this.bounty = bounty;
    }
    useAbility() {
        console.log('using so many abilities: ' + this.ability);
    }
}
let apple = new SuperVillain("Apple Jupiter", "Flesh Fruit", 110000);
let pepper = new SuperVillain("Pepper Jupiter", "Drowsy Fist", 110000);
//console.log(pepper.bounty);
//apple.useAbility();
////////////////ABSTRACT CLASSES
class Food {
    isCooked() {
        //you CAN give implementation inside of an abstract class
        console.log('from abstracct class');
    }
}
class BuffaloChicken extends Food {
    constructor() {
        super();
        this.calories = 50;
        this.type = "buff chicken";
    }
    goBad() {
        throw new Error("Method not implemented.");
    }
    isCooked() {
        //you CAN give implementation inside of an abstract class
        console.log('from concrete class');
    }
    newRandomMethod() {
    }
}
let myBuffChicken = new BuffaloChicken();
class SouthernStyleBuffaloChicken extends BuffaloChicken {
}
let mySSBC = new SouthernStyleBuffaloChicken();
//is polymorphism possible in TS?
let buffaloChickenArray = [mySSBC, myBuffChicken];
//let mySSBCProxy = BuffaloChicken as mySSBC;
////////////////////more on classes
class Pet {
    // private name: string;
    // private age: number;
    // private breed: string;
    /*
        question marks in the constructor make the parameter optional:
            each parameter to the right of the question mark must ALSO be optional.
            In short, optional parameters will always be at the end of the parameter list

            giving an access modifier in the constructor's parameter list will declare a field in
            your object FOR YOU with the name name as that constructor parameter. THEN it will
            set the field's value equal to the parameter/argument's value
    */
    constructor(name, age, breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        // this.name=name;
        // this.age=age;
        // this.breed=breed;
    }
    //you can also give default values for parameters
    //constructor(name: string, age: number, breed: string="dinosaur"){
    // constructor(){
    //may not have multiple constructors
    // }
    printState() {
        console.log("state:", this.name, this.age, this.breed);
    }
    get Name() {
        console.log("in get method");
        return this.name;
    }
    set Name(name) {
        console.log("in set method");
        this.name = name;
    }
}
//let pupper = new Pet("Fido", 15, "Golden Retriever");
let pupper = new Pet("Fido", 15);
//what if I leave out a value?
pupper.printState();
//using the "get" and "set" kehywords make the getter and setters behave more like
// fields than methods
// console.log(pupper.Name);
// pupper.Name= "Spot";
// console.log(pupper.Name);
/////////////////////
// class Quiz{
//     questionNum: number;
//     points: number;
// }
//let's import the Quiz from another file
// at the top of this file put the following:
//      import {Quiz} from "./quiz";
function printQuiz(q1) {
    console.log(q1.points, q1.questionNum);
}
printQuiz({ questionNum: 225, points: 100 });
export {};
