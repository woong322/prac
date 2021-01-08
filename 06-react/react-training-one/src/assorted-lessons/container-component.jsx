import React from 'react';

function ContainerComponent(props){

    return (
        <React.Fragment>
            ContainerComponent Starts Here:
            {props.visibilityTrevin ? props.children : null}
        </React.Fragment>
    )
}

export default ContainerComponent;