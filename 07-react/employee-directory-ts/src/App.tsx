import React from "react";
import { BrowserRouter, Route } from "react-router-dom";
import { ClickerComponent } from "./views/components/clicker/ClickerComponent";
import { AppContainer } from "./views/components/common/app-container";
import { EmployeeDisplay } from "./views/components/display/employee-table-container-component";
import { ImageComponent } from "./views/components/image/ImageComponent";
import EDLogin from "./views/components/login/EDLogin";

function App() {
  return (
    <BrowserRouter>
      <Route
        exact
        path="/"
        render={() =>
          localStorage.getItem("username") ? (
            <AppContainer>
              <EmployeeDisplay />
            </AppContainer>
          ) : (
            <EDLogin />
          )
        }
      />
      <Route path="/clicker" component={ClickerComponent} />
      <Route path="/image" component={ImageComponent} />
      {/* <EmployeeDisplay></EmployeeDisplay>
        <ClickerComponent />
        <ImageComponent /> */}
    </BrowserRouter>
  );
}

export default App;
