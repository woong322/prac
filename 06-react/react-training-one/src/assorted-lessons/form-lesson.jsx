import React from 'react';

class FormDemo extends React.Component{

    constructor(props){
        super(props);
        this.state = {villainName: "", villainPower: ""};
        this.userTypeStuff = this.userTypeStuff.bind(this);
    }

    userTypeStuff(myEvent){
        console.log('stuff is changing');
        this.setState({
            [myEvent.target.name]: myEvent.target.value
        });
    }

    render() {
        return (
            <>
                {/* React Components are read only.
                    React rendering binds the view of the client side to the values
                    inside of the model (aka the rEact DOM). Basically the html page is
                    a viewport into the world of the components. I can only SEE in the world
                    of the components, not modify.
                */}

                {/* Before */}
                <form>
                    <input type="text" name="villainName" value="" placeholder="vill name"/>
                    <input type="text" name="villainPower" value="" placeholder="vill power"/>
                </form>

                {/* After */}
                <form>
                    <input type="text" name="villainName" value={this.state.villainName} placeholder="vill name"
                        onChange={this.userTypeStuff}/>
                    <input type="text" name="villainPower" value={this.state.villainPower} placeholder="vill power"
                        onChange={this.userTypeStuff}/>
                </form>
            </>
        );
    }
}

export default FormDemo;