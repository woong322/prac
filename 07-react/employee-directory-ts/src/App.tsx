import React from "react";
import { AppContainer } from "./views/components/common/app-container";
import { EmployeeDisplay } from "./views/components/display/employee-table-container-component";

function App() {
  return (
    <div className="App">
    <AppContainer>
      <EmployeeDisplay></EmployeeDisplay>
    </AppContainer>
  </div>
  );
}

export default App;
