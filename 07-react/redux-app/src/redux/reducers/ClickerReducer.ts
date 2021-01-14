import { ClickerActions } from "../actions/ClickerAction";
import { IAppState } from "../state";
import { IClicker } from "../state/IClicker";

const initialState:IClicker = {
    count: 0
}


//if nothing else happens inside this function, make sure you return the state given in the argument
export const ClickerReducer = (state= initialState, action:any) => {
    console.log(state);
    switch(action.type){
        case ClickerActions.INCREASE_COUNT:
            return {
                ...state,
                count: state.count + action.payload.count
            };
        default: 
            return state;
    }
}