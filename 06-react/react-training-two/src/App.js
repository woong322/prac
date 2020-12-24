import './App.css';
import AxiosAjax from './assorted-lessons/ajax-using-axios';
import ConditionalRendering from './assorted-lessons/conditional-rendering';
import OurFirstAjax from './assorted-lessons/our-first-ajax-request';

function App() {
  return (
    <div className="App">
      <ConditionalRendering myCondition={true}/>
      <OurFirstAjax/>
      <AxiosAjax/>
    </div>
  );
}

export default App;
