/* eslint-disable react/prop-types */
import React from 'react';

/*
    Class components are older
        -They can be messier as well. class components have state
        -And they can hook into the lifecyle of a component easier (...stay tuned for this...because later on
            we have tools that can let function components have state)

*/
class MyClassComponent extends React.Component {
  render() {
    return (
      <>
        <br />
        <h4>From MyClassComponent: {this.props.parentPassingInformation}</h4>
        <button className="btn btn-info">
          Class Button
        </button>
        <br />
        <h4>{this.props.secondAttr}</h4>
      </>
    );
  }
}

export default MyClassComponent;
