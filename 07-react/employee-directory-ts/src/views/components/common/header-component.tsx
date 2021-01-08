import React from 'react';

interface IProps{

}

export const Header: React.FC<IProps> = (props:IProps) => {
    return (
        <div className="card">
            <header className="card-header">
                <h2>Welcome to the Employee Directory</h2>
                <h4>A platform for viewing and managing employees</h4>
            </header>
        </div>
    )
}