import React from 'react';

class OurFirstAjax extends React.Component {
    constructor(props){
        super(props);
        this.state = { targetPokemon: null};
        this.fetcher = this.fetcher.bind(this);
    }

    async fetcher(event){
        const responsePayload = await fetch('https://pokeapi.co/api/v2/pokemon/starmie');

        let payloadConverted = await responsePayload.json();
        this.setState({targetPokemon: payloadConverted});
    }

    render(){
        if(!this.state.targetPokemon){
            return (
                <>
                    No Pokemans
                    <button onClick={this.fetcher}>Go get JSON from pokeAPI</button>
                </>
            );
        }

        return (
            <>
                <button onClick={this.fetcher}>Go get JSON from pokeAPI</button>
                <ul>
                    <li>{this.state.targetPokemon.name}</li>
                    <li>{this.state.targetPokemon.id}</li>
                </ul>
            </>
        );
    }
}

export default OurFirstAjax;