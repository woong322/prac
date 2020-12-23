import React from 'react';
import PropTypes from 'prop-types';

/*
    Class components are older
        -They can be messier as well. class components have state
        -And they can hook into the lifecyle of a component easier (...stay tuned for this...because later on
            we have tools that can let function components have state)


    The    { }     syntax is referred to as "interpolation". Interpolation evaluates an expression of some
    sort. It is similar to template literals.

*/
class MyClassComponent extends React.Component {
  render() {
    return (
      <React.Fragment>
        <br />
        MyClassComponent starts here:
        <h4>From MyClassComponent: {this.props.parentPassingInformation}</h4>
        <button className="btn btn-info">
          Class Button
        </button>
        <br />
        <h4>{this.props.secondAttr}</h4>
      </React.Fragment>
    );
  }
}

/*
  Prop Validation
  prop validation causes an error if the props you're attempting to use aren't expected. This is a way
  for anyone using the component to keep track of what types of information the component
  will have access to.


  "isRequired" is essentially not-null
*/
MyClassComponent.propTypes ={
  //mandatory
  parentPassingInformation: PropTypes.string.isRequired,
  //optional
  secondAttr: PropTypes.any
}

export default MyClassComponent;
