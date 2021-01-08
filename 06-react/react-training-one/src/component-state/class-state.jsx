import React from 'react';

class ClassStateComponent extends React.Component {
    // constructor(props){
    //     super(props);
    //     this.state={buttonClickCount: 0};

    //     this.myCustomEventHandler = this.myCustomEventHandler.bind(this);
    // }
    
    state= {buttonClickCount: 0};

    myCustomEventHandler = (event) =>{
        const moreClicks = this.state.buttonClickCount +1;

        console.log("button clicked, value: ", moreClicks);

        /*JUST updating the value of the state will NOT tell the component
        to rerender the view. You can see that the console.log is still triggering
        and the value is updating....but the view doesn't reflect those changes.
        */
        //this.state.buttonClickCount = moreClicks;

        //setState() will update the value of the state AND trigger a rerender
        this.setState({buttonClickCount: moreClicks});
        
    }

    render () {
        return (
            <React.Fragment>
                <br/>
                ClassStateComponent starts here:
                <br/>
                <button onClick={this.myCustomEventHandler}>ClassStateButton: {this.state.buttonClickCount}</button>
                <br/>
            </React.Fragment>
        );
    }
}

export default ClassStateComponent;