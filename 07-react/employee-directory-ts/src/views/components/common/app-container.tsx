import React, { Fragment } from 'react';
import { Header } from './header-component';

interface IProps{
    children:any;
}

export const AppContainer: React.FC<IProps> = (props:IProps) => {
    return (
        <Fragment>
            <Header></Header>
            {props.children}
        </Fragment>
    )
}