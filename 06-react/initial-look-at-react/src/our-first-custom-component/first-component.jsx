import React from 'react';

function FirstComponent() {
    return (
        <React.Fragment>
            <div id="innerDiv">
                <h1>Our First Component is functioning as intended!!!</h1>
            </div>
            <h2>
                Sibling Element, to demo that you need to surround your elements with a single parent
        </h2>
        </React.Fragment>
    );
}

export default FirstComponent;
