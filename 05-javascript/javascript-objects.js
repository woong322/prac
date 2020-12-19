/* OBJECTS

    What is an object?
        -a model of a real world physical object
        -it has state and behavior
        -in JS, objects are key-value pairs
*/





// how do I create an object?
var objectOne = {
    // to declare a member of an object, you use key-value pairs
    // attribute: value

    name: "Danny Boy",
    'ability': 'electromagnetism',
    'official bounty': 250000,

    // this is how you'd add a method
    doCrimeMethod: function(){
        // method logic
        console.log("inside doCrimeMethod()")
    }
}

// how do I see all the contents of the object?
// console.log(objectOne);



// how do I access an attribute of an object?
// console.log(objectOne.name);
// console.log(objectOne.ability); // prints "electromagnetism"
//objectOne.doCrimeMethod();

//what is the problem here?
//console.log(objectOne.official bounty);

//you can ALSO access attributes using another syntax
// console.log(objectOne["official bounty"]);
// console.log(objectOne['name']);

/*
    How useful is objectOne["name"] syntax?

    imagine we have an object field titled "y2.k-18"
    this will NOT work;    console.log(objectOne.y2.k-18)

    this WILL work:
        var a="y2.k-18"
        console.log(objectOne[a])
*/

// what happens if I attempt to access an attribute that doesn't exist?
//console.log(objectOne['hair color']); // prints "undefined"



// how do I update the value of an attribute?
objectOne["official bounty"]=280000;
//console.log(objectOne["official bounty"]); //prints "250000"



// what happens if I attempt to update an attribute that doesn't exist?
objectOne.role="Mob Boss";
// console.log(objectOne.role); // print "Mob Boss"

// console.log(objectOne);

// you may also dynamically add methods
objectOne.myMethod= function (){ console.log("in dynamically added method")};
objectOne.myMethod();


//how do I dynamically remove an attribute?
delete objectOne["official bounty"];
// console.log(objectOne);

/* JUST FOR KICKS */
//will this run?
objectOne.newAttribute=objectOne;
//console.log(objectOne);