import type {Quiz} from "./quiz";
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
let s3: number; //number
let s30 = 5; //number
let s31: number = 10; // number

//you can restict dataypes to a range of possible options. In this case it could be a number, boolean, or string
let s4: number | string | boolean;
s4= 5;
s4="hello";

//any
let n1;
n1=5;
n1="stuff";
let n10: any;

//the following are a bit interchangeable
let v1: null = null;
let v2: void = null;
let nul2: null = undefined;
let un1: undefined = null;

//arrays
let array1=[2,3,4,5];
// array1[1]="hello";
let array2: string[];
let array3: Array<number>;


//tuple (basically, it's a fixed size and datatype  and order array)
let tuple: [string, boolean, number];

//tuple = [false, 5, "hello"];
tuple = ["hello", false, 5];


enum carStates{OFF, IDLE, STOPLIGHT, ACCEL, DRIVING};
let myVar = carStates.ACCEL;





/////////////FUNCTIONS
function myfunc(first: number, second: string): string{
    //remember, we're now in a strong typed language

    return "hola";
    //return 18;
}


//function myOtherFunc(): void {  //you CAN force it to be void}
function myOtherFunc(){
    //the return type is void by default (hover over the method signature to see it)

    //BUT....if you return any datatype the return type will follow suit.
    //return 5; //return type is void UNTIL you uncomment this line
    
}



/////////////////////////////////
// function myFunc2(make, model, color, year, topspeed, mileage,..........){

// }




/*
    INTERFACE
*/

interface Criminal{

    name: string;
    
    //i'll comment out these variables for the sake of simplicity
    // criminalRecord: boolean;
    // minions: number;

    //i'll comment out this method for the sake of simplicity.
    //method1(var1: string, var2: number): string;


    // method1(var1: string, var2: number): string{
        //this is an implementation...but an interface shouldn't have implementations
        //so this method wouldn't compile
    // }
}


function myfunc3(daVariable: Criminal){
    console.log(daVariable);
    console.log(daVariable.name);
}

//notice I am STILL creating an object literal, but it now has a datatype being enforced
// let daCriminal: Criminal = {'name': 'Joker', 'criminalRecord': true, 'minions': 600};

//myfunc3({"centaur": "much yes"});
// myfunc3(daCriminal);


/* CLASSES */
class SuperVillain implements Criminal{

    /*
    What are the access modifiers in typescript?
        private, public, protected, THERE IS NOT A DEFAULT

        public acts as the "default" modifier if you don't use an access keyword
    */

    public name: string;
    protected ability: string;
    private bounty: number;

    constructor(name: string, ability: string, bounty: number){
        this.name=name;
        this.ability=ability;
        this.bounty=bounty;
    }

    useAbility(): void{
        console.log('using so many abilities: '+this.ability);
    }

}

let apple: SuperVillain = new SuperVillain("Apple Jupiter", "Flesh Fruit", 110_000);
let pepper: SuperVillain = new SuperVillain("Pepper Jupiter", "Drowsy Fist", 110_000);

//console.log(pepper.bounty);
//apple.useAbility();



////////////////ABSTRACT CLASSES
abstract class Food{
    type: string;
    calories: number;

    abstract goBad();

    isCooked(){
        //you CAN give implementation inside of an abstract class
        console.log('from abstracct class');
    }
}


class BuffaloChicken extends Food{
    protected cutType: string;


    constructor(){
        super();
        this.calories= 50;
        this.type="buff chicken";
    }

    goBad() {
        throw new Error("Method not implemented.");
    }

    
    isCooked(){
        //you CAN give implementation inside of an abstract class
        console.log('from concrete class');
    }

    newRandomMethod(){

    }

}

let myBuffChicken = new BuffaloChicken();
//myBuffChicken.isCooked();



interface A{}
interface B{}

class SouthernStyleBuffaloChicken extends BuffaloChicken implements A, B{

}

let mySSBC = new SouthernStyleBuffaloChicken();

//is polymorphism possible in TS?
let buffaloChickenArray: BuffaloChicken[] = [mySSBC, myBuffChicken];
//let mySSBCProxy = BuffaloChicken as mySSBC;





////////////////////more on classes
class Pet{
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
    constructor(private name: string, private age?: number, private breed?: string){
        // this.name=name;
        // this.age=age;
        // this.breed=breed;
    }

    //you can also give default values for parameters
    //constructor(name: string, age: number, breed: string="dinosaur"){

    // constructor(){
        //may not have multiple constructors
    // }

    public printState(){
        console.log("state:", this.name,this.age, this.breed);
    }

    get Name(): string{
        console.log("in get method")
        return this.name;
    }

    set Name(name: string){
        console.log("in set method");
        this.name=name;
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

function printQuiz(q1: Quiz){
    console.log(q1.points, q1.questionNum);
}

printQuiz( {questionNum: 225, points: 100});







export {};

