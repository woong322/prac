import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import MyClassComponent from './first-look-at-components/class-component';
import MyFunctionComponent from './first-look-at-components/function-component';

ReactDOM.render(
  <React.StrictMode>
    <App />
    {/* <MyClassComponent/>
    <MyFunctionComponent/> */}
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
