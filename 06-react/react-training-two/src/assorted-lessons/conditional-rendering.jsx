import React from 'react';

////////////////VARIABLES THAT HOLD ELEMENTS
function ConditionalRendering(props) {

    let myElement;
    if(props.myCondition){
        myElement =    <h1 className="firstStyle">Monkey</h1>
    }else{
        myElement =    <h1 className="secondStyle">Wolf</h1>
    }

    return (
        <>
            {myElement}
        </>
    );
}

////////////USING TERNARY
// function ConditionalRendering(props) {
//     return (
//         <>
//             { props.myCondition ?  <h1>Monkey</h1> : <h1>Wolf</h1>}
//         </>
//     );
// }


/////////////////////USING IF-ELSE STATEMENT
// function ConditionalRendering(props) {

//     if(props.myCondition){
//         return (
//                     <h1>Monkey</h1>
//                 );
//     }else{
//         return (
//             <h1>Wolf</h1>
//         );
//     }
// }

export default ConditionalRendering;
