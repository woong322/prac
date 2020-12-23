import React, { useState } from 'react';

function FunctionStateComponent(props) {


    //this is our declaration for function state
    // const [variableName, variableSetter] = useState(initialValue);
    const [buttonClickCount, setButtonClickCount] = useState(props.randomQuestionAsked);
    const [stringAppender, setStringAppender] = useState("Zach");

    //using the set{VariableName} function will rerender the component, if you don't
    // use this setterVariable then your component will not rerender


    //what happens if we have useState() in a conditional statement?
    // let mybool = false;
    // if(!mybool){

    //     const [stringAppender, setStringAppender] = useState("Zach");
    // }

    return (
        <React.Fragment>
            <br />
            FunctionStateComponent starts here:
            <br />
            <button onClick={() => setButtonClickCount(buttonClickCount+1)}>
                    FunctionStateButton: {buttonClickCount}</button>
            <br />
            <button onClick={() => setStringAppender(stringAppender+"MoreZach")}>
                    FunctionStateButton: {stringAppender}</button>
            <br/>
        </React.Fragment>
    );
}

export default FunctionStateComponent;