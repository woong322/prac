import React from 'react';
import axios from 'axios';

class AxiosAjax extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            targetPokemon: {}
        }
    }

    componentDidMount(){
        console.log("in did mount method");

        axios.get('https://pokeapi.co/api/v2/pokemon/starmie')
            .then(
                (response) => {
                    this.setState({targetPokemon: response.data});
                }
            );
    }

    render(){
        return (
            <>
                <h2>{this.state.targetPokemon.name}</h2>
                <h2>{this.state.targetPokemon.id}</h2>
            </>
        );
    }
}

export default AxiosAjax;