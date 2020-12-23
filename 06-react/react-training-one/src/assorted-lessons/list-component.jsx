import React from 'react';

/*
    The    { }     syntax is referred to as "interpolation". Interpolation evaluates an expression of some
    sort. It is similar to template literals.
*/
function ListComponent(props){

    let i=0;

    let myList= ["listElemOne", "listElemTwo", "listElemThree"];

    return (
        <>
            {myList.map((myString) => <h6 key={myString}>{myString}</h6>)}
        </>
    );
}

export default ListComponent;