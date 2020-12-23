import React from 'react';
import './App.css';
import ChildToParentInfoFlow from './assorted-lessons/child-to-parent-info';
import ContainerComponent from './assorted-lessons/container-component';
import FormDemo from './assorted-lessons/form-lesson';
import HtmlAttributes from './assorted-lessons/html-attributes';
import ListComponent from './assorted-lessons/list-component';
import ClassStateComponent from './component-state/class-state';
import FunctionStateComponent from './component-state/function-state';
import MyClassComponent from './first-look-at-components/class-component';
import MyFunctionComponent from './first-look-at-components/function-component';

let parentObject = {
  firstAttribute: 15,
  secondAttribute: "world",
  thirdAttribute: function (firstArg, secondArg) {
    console.log('Parent function has triggered: ', firstArg, secondArg);
  }
}

function App() {


  return (
    <div className="App">
      This text is from the App Component
      <br />


      {/* The    { }     syntax is referred to as "interpolation".
      Interpolation evaluates an expression of some sort. It is similar to template literals.*/}
      <h6>THIS is interpolation: {7*3+4}</h6>
      <h6>THIS is also interpolation: {(()=>{let myVar=7; return myVar*myVar;})()}</h6>
      <br/>


      {/* There are TWO types of components we can make:
        Function Components and Class Components
        
        Notice in the two components below, we are passing information from parent ("App.jsx")
        to child ("MyFunctionComponent" and "MyClassComponent").
        The child components then display the information to prove that they have received that information.
        */}
      <MyFunctionComponent parentPassingInformation="Lunch Money" secondAttr="Ride to School" />
      {/* <MyFunctionComponent parentPassingInformation="no" secondAttr="Ride to School"/> */}

      <MyClassComponent parentPassingInformation="Lunch Money" secondAttr="Ride to School" />
      <br />

      {/* ALSO this is how to send information from child to a parent, essentially we are providing
      a callback function (we also happen to be using the spread operator) */}
      <ChildToParentInfoFlow {...parentObject} />

      {/* This example demonstrates ohw your components can hold state. Keep in mind, class and function
      components have different steps in order to maintain state and rerender the view */}
      <ClassStateComponent/>
      <FunctionStateComponent randomQuestionAsked={5}/>




      {/* This example demonstrates how you can use vanilla JS to display entire lists
      of elements */}
      <ListComponent />

      {/* This example demonstrates how SOME html attributes have changes. For example:
          "class" has become "className" */}
      <HtmlAttributes />

      {/* This example desmonstrates how you can control which subelements are visible */}
      <ContainerComponent visibilityTrevin={false}>
          <h6>Inside container component: alpha</h6>
          <h6>Inside container component: bravo</h6>
      </ContainerComponent>
      <ContainerComponent visibilityTrevin={true}>
          <h6>Inside container component: delta</h6>
          <h6>Inside container component: oscar</h6>
      </ContainerComponent>

        <FormDemo/>
    </div>
  );
}


export default App;
