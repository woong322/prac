/* eslint-disable react/prop-types */
import React from 'react';

function MyFunctionComponent(props){

    if(props.parentPassingInformation=="no"){
        return (
            <h1>Parent didnt give me any information! Sad face.</h1>
        )
    }

    return (
        <React.Fragment>
            <br/>
            <h4>From MyFunctionComponent: {props.parentPassingInformation}</h4>
            <br/>
            <button className="btn btn-success">
                Function Button
            </button>
            <br/>
            <h4>{props.secondAttr}</h4>
        </React.Fragment>
    );
}

export default MyFunctionComponent;