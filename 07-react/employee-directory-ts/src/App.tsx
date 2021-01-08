import React from "react";
import { ClickerComponent } from "./views/components/clicker/ClickerComponent";
import { AppContainer } from "./views/components/common/app-container";
import { EmployeeDisplay } from "./views/components/display/employee-table-container-component";
import { ImageComponent } from "./views/components/image/ImageComponent";

function App() {
  return (
    <div className="App">
    <AppContainer>
      <EmployeeDisplay></EmployeeDisplay>
      <ClickerComponent/>
      <ImageComponent/>
    </AppContainer>
  </div>
  );
}

export default App;
