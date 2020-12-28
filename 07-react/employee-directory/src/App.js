import logo from './logo.svg';
import './App.css';
import EmployeeDisplay from './components/display/employee-table-container-component';
import AppContainer from './components/common/app-container';

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
