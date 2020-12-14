/* CONDITIONS */

function myFunction(myBool){
    if(myBool)
        console.log("IT WORKED!!!");
    else
        console.log("sad face :(");
}

// console.log(true);
// myFunction(true);
// myFunction(false);
// myFunction(15); //true
// myFunction(0); //false
// myFunction(-17); //true
//myFunction(18); //true
// myFunction("my string"); //true
// myFunction(""); //false
// myFunction("false"); //true
// myFunction(NaN); //false
// myFunction(null); //false
// myFunction([]); //true
// myFunction(undefined); //false
myFunction(Infinity); //true
myFunction(5000000); //true
myFunction(-Infinity); //true
myFunction(5.5); //true
myFunction(0.0);
myFunction({});

//What are the TRUTHY values in JS?
//anythign that isn't falsey

//What are the FALSEY vales in JS?
// false, 0, "", null, undefined, NaN


///why is this useful?
// if(obj==null)
// if(obj)

// if(myInt==0)
// if(myInt)


/* Short circuiting

    T and T     =   T
    T and F     =   F
    F and T     =   F
    F and F     =   F

    T or T     =   T
    T or F     =   T
    F or T     =   T
    F or F     =   F

    shortcircuiting operators:   &&  , ||
    bitwise operators:   & , |,  ^, etc
*/
function trueFunction(){
    console.log("in true function");
    return true;
}
function falseFunction(){
    console.log("in false function");
    return false;
}

let circuitVar = false;

//if(circuitVar & falseFunction()){
if(circuitVar && falseFunction()){
    //console.log("if block");
}else{
    //console.log("else block");
}