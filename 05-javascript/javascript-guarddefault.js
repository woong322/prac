//guard operator  "&&"
function guardFunction(){
    //return 5 && 8; //returns 8
    //return 0 && 15;  //returns 0
    return 5 && 0; //returns 0
    //return (complex statement) && (another complex statement)
}

//console.log(guardFunction());


//default operator "||"
function defaultFunction(){
    //return "" || "Panda Express"; //returns "Panda Express"
    return "Publix" || "Meijer"; //returns "Publix"
}

console.log(defaultFunction());
