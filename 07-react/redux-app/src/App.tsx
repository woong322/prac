import React from "react";
import logo from "./logo.svg";
import "./App.css";
import ClickerComponent from "./components/clicker/ClickerContainer";
import { Provider } from "react-redux";
import { store } from "./redux/Store";

function App() {
  return (
    <Provider store={store}>
      <ClickerComponent />
    </Provider>
  );
}

export default App;
