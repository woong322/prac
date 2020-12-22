import React from 'react';

/*
    Class components are older
        -They can be messier as well. class components have state
        -And they can hook into the lifecyle of a component easier (...stay tuned for this...because later on
            we have tools that can let function components have state)

            
*/
class MyClassComponent extends React.Component{

    render(){
        return (
            <React.Fragment>
                <button className="btn btn-info">
                    Class Button
                </button>
            </React.Fragment>
        );
    }
}

export default MyClassComponent;