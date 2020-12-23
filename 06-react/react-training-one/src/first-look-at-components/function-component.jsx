/* eslint-disable react/prop-types */
import React from 'react';
import PropTypes from 'prop-types';

/*
    Function components are newer
    Theya re actually best practice in the industry.
    Easier to read and test. Less code.
    Accessing the state is a bit different than ClassComponents but still possible.


    The    { }     syntax is referred to as "interpolation". Interpolation evaluates an expression of some
    sort. It is similar to template literals.
*/
function MyFunctionComponent(props){

    if(props.parentPassingInformation==="no"){
        return (
            <h1>Parent didnt give me any information! Sad face.</h1>
        )
    }

    return (
        <React.Fragment>
            <br/>
            MyFunctionComponent starts here:
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


/*
  Prop Validation
  prop validation causes an error if the props you're attempting to use aren't expected. This is a way
  for anyone using the component to keep track of what types of information the component
  will have access to.


  "isRequired" is essentially not-null
*/
MyFunctionComponent.propTypes ={
    //mandatory
    parentPassingInformation: PropTypes.string.isRequired,
    //optional
    secondAttr: PropTypes.any
}

export default MyFunctionComponent;