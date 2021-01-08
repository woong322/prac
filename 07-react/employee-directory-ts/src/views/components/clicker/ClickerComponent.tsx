import React, { useState } from 'react';

interface IProps{

}

export const ClickerComponent: React.FC<IProps> = (props: IProps) => {

    const [count, setCount] = useState(0);

    const increment = (n:number):void => {
        setCount(count + n);
    }

    return (
        <div>
            <button onClick={() => increment(1)}>{count}</button>
        </div>
    )
}