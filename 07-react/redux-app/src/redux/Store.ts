import { compose, createStore, Store } from "redux";
import { state } from "./state";


const a:any = window;

//will gather the compose function from either redux devtools or from redux
const composeEnhancers = a.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__ || compose

//will run the compose function from either the redux devtools or the redux library
const enhancer = composeEnhancers();

// create the store with the initial state and created functionality
export const store: Store<any> = createStore(state,enhancer);