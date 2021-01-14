import * as React from 'react';

interface IClickerComponentProps {
    count:number;
    increment: (n:number) => void;
}

const ClickerComponent: React.FunctionComponent<IClickerComponentProps> = (props) => {
  return (
      <div>
          <button onClick={() => props.increment(1)}>{props.count}</button>
      </div>
  );
};

export default ClickerComponent;
