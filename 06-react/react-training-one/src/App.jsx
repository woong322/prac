import React from 'react';
import './App.css';
import MyClassComponent from './first-look-at-components/class-component';
import MyFunctionComponent from './first-look-at-components/function-component';

function App(){
  return (
    <div className="App">
      This text is from the App Component
      <br/>
      <MyFunctionComponent parentPassingInformation="Lunch Money" secondAttr="Ride to School"/>
      {/* <MyFunctionComponent parentPassingInformation="no" secondAttr="Ride to School"/> */}

      <MyClassComponent parentPassingInformation="Lunch Money" secondAttr="Ride to School"/>
    </div>
  );
}

export default App;
