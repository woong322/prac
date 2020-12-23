import React from 'react';
import PropTypes from 'prop-types';

function ChildToParentInfoFlow(props){

    return (
        <React.Fragment>
            <h5>ChildToParentInfoFlow Component starts here:</h5>
            <br/>
            {props.thirdAttribute("custom child arg1", "custom child arg2")}
            <br/>
            {props.thirdAttribute(props.firstAttribute, props.secondAttribute)}
        </React.Fragment>
    );
}

//Prop Validation
ChildToParentInfoFlow.propTypes = {
    firstAttribute: PropTypes.number,
    secondAttribute: PropTypes.string,
    thirdAttribute: PropTypes.func.isRequired,
}

export default ChildToParentInfoFlow;