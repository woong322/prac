
window.onload = function() {
	
	//I don't want to add an event listener because the page load IS THE EVENT
	//in your project 1, you'll be going to the server here to get the session data...because THAT is who
	// is currently logged in
	getAllVills();
}

let myUserInformation ={};

function getAllVills() {
	fetch(
			'http://localhost:9005/Project-One-Connection-Demo/api/ajax/allVillains')
			.then(function(daResponse) {
				const convertedResponse = daResponse.json();
				return convertedResponse;
			}).then(function(daSecondResponse) {
				console.log(daSecondResponse);
				myUserInformation=daSecondResponse;
				ourDOMManipulation(daSecondResponse);
			})

}

function ourDOMManipulation(ourJSON) {
	// document.getElementById("pokeName").innerText = ourJSON.name;
	// document.getElementById("pokedexNumber").innerText = ourJSON.id;
	// document.getElementById("pokeImage").setAttribute("src",
	// ourJSON.sprites.front_default);

	for (let i = 0; i < ourJSON.length; i++) {

		// ///////////CREATE ELEMENTS DYNAMICALLY//////////////
		// step1: creating our new element
		let newDiv = document.createElement("li");

		// step3: create a text node, then append to our new div element
		let divText = document.createTextNode("VillName: "+ourJSON[i].name+", "+ourJSON[i].superpower);
		newDiv.appendChild(divText);

		// step4: appending our new div element onto an existing element that is
		// currently being displayed
		let newSelection = document.querySelector("#myVillList");
		newSelection.appendChild(newDiv);

		console.log(newDiv);
		///////////////table time
	    
	 // ///////////CREATE ELEMENTS DYNAMICALLY//////////////
		// all creations
		let newTR = document.createElement("tr");
		let newTH = document.createElement("th");
		
		let newTD1 = document.createElement("td");
		let newTD2 = document.createElement("td");
		let newTD3 = document.createElement("td");
		
		// population creations
		newTH.setAttribute("scope", "row")
		let myText1 = document.createTextNode(ourJSON[i].id);
		let myText2 = document.createTextNode(ourJSON[i].name);
		let myText3 = document.createTextNode(ourJSON[i].superpower);
		let myText4 = document.createTextNode(ourJSON[i].bounty);
		newDiv.appendChild(divText);
		
		
		///all appendings
		newTH.appendChild(myText1);
		newTD1.appendChild(myText2);
		newTD2.appendChild(myText3);
		newTD3.appendChild(myText4);
		
		newTR.appendChild(newTH);
		newTR.appendChild(newTD1);
		newTR.appendChild(newTD2);
		newTR.appendChild(newTD3);
		let newSelectionTwo = document.querySelector("#villTableBody");
		newSelectionTwo.appendChild(newTR);

		//additional note: consider pagination
		// my endpoint:
		//			website.net?startpagination=21&endpagination=40
		//			OR
		//			website.net?pagination=3
	}
}