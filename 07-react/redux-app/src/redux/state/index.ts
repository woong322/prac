import { combineReducers } from "redux";
import { ClickerReducer } from "../reducers/ClickerReducer";
import { IClicker } from "./IClicker";


export interface IAppState{
    clickerState: IClicker;
}

//you invoke this function with an object that is going to have the shape of the application state, but
//      takes in the reducer associated with each state as the values.
export const state = combineReducers<IAppState>({
    clickerState: ClickerReducer
})