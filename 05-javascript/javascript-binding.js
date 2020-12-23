console.log("hello from binding file");

let apple = {
    "name": "Apple Jupiter",
    "superpower": "flesh fruit"
}

let pepper = {
    "name": "Pepper Jupiter",
    "superpower": "drowsy fist",
    "arrowPrintState": ()=>{console.log("name:", this.name,"\t\t\tsuperpower:", this.superpower);}
}

function printState(){
    //console.log("Printing this to console:");
    //console.log(this);
    console.log("name:", this.name,"\t\t\tsuperpower:", this.superpower);
}

printState(); //prints undefined undefined
pepper.arrowPrintState();

// let applePrintState = printState.bind(apple);
// let pepperPrintState = printState.bind(pepper);
// applePrintState();
// pepperPrintState();



