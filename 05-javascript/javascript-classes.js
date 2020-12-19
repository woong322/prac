/*
    CLASSES

    -classes are just syntatical sugar. They don't add any new functionality.
    -JS will still use prototypical inheritance "under the hood"

    -came along in ES6 (ECMAScript2015)
*/




///class expression

let SuperHero = class{
    constructor(name, superpower){
        this.name=name;
        this.superpower = superpower;
    }
}

let staticshock = new SuperHero("Static Shock", "Electrokenesis");
// console.log(staticshock);


//class declaration
class SuperVillain{
    constructor(name, superpower, bounty){
        this.name = name;
        this.superpower = superpower;
        this.bounty = bounty;
    }

    doCrime(){
        console.log("so many crimes, too many crimes");
    }

    getName(){
        console.log(this.name);
    }

    get superpowerVar(){
        console.log("in the getter");
        return this.superpower;
    }

    static joinLeagueOfDoom(quote){
        console.log(quote);
    }
}


let pandora = new SuperVillain("Pandora", "Chaos Control", 350000);
// console.log(pandora);
// console.log(pandora.bounty);
// pandora.doCrime();

//console.log(pandora.getSuperpower());
// console.log(pandora.superpowerVar());

//you can use the "get" keyword to make your getters behave like fields
console.log(pandora.superpowerVar);


//we even have static members
//SuperVillain.joinLeagueOfDoom("I triggered a static method?");

//once static,we can't call the static members in a non-static way
// pandora.joinLeagueOfDoom("can I target it from the object itself?");









//class inheritance//
//and yes, you can even extends other classes
class MegaVillain extends SuperVillain{

    constructor(...constructArgs){
        super(...constructArgs);
    }
}