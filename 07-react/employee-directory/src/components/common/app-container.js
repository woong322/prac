import React, { Fragment } from "react";
import Header from "./header-component";

const AppContainer = (props) =>{
    return (
        <Fragment>
            <Header></Header>
            {props.children}
        </Fragment>
    )
}

export default AppContainer;