package com.example.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.dao.FoodRepo;
import com.example.model.Food;

/*
  
mywebsite.net/api/{myModel}

//select all (GET http method)
mywebsite.net/api/rebursement

//select speicific id (GET http method)
mywebsite.net/api/rebursement/{id}
mywebsite.net/api/rebursement/id/{id}

//create (POST http method)
mywebsite.net/api/rebursement       <---the body will contain the new JSON to be put into the DB

//update (PUT http method)
mywebsite.net/api/rebursement           <-----the body of the request will contain the necessary ID
mywebsite.net/api/rebursement/{id}        <---the body will contain the new JSON to replace the existing record
mywebsite.net/api/rebursement/update/{id} 

//delete (DELETE http method)
mywebsite.net/api/rebursement           <-----the body of the request will contain the necessary ID
mywebsite.net/api/rebursement/{id}
mywebsite.net/api/rebursement/delete/{id}

*/


@Controller
@RequestMapping("/api")
@CrossOrigin(origins="*") //OR you can specifically note a domain [origins="localhost:9005"]
public class FoodController {

	/////FIELDS
	private FoodRepo foodRepo;
	
	////CONSTRUCTORS
	public FoodController() {
	}

	@Autowired
	public FoodController(FoodRepo foodRepo) {
		this.foodRepo = foodRepo;
		helperIntialValues();
	}
	
	@ResponseStatus(value=HttpStatus.CREATED)
	@GetMapping(value="/getAllFood")
	//@RequestMapping(value="/getAllFood", method=RequestMethod.GET)
	public @ResponseBody List<Food> getAllFoods(){
		return foodRepo.selectAll();
	}
	
	@PostMapping(value="/getFoodById")
	@ResponseBody
	//@RequestMapping(value="/getFoodById", method=RequestMethod.POST)
	public Food getFoodById(@RequestParam("id") int id) {
		
		return foodRepo.selectById(id);
	}
	
	//let's take a moment to do this using a single annotations
	@PutMapping(value="/getFoodByIdTWO", params= {"id"}, produces="application/json")
	public ResponseEntity<Food> getFoodByIdTWO(int id) {
		/*
		 * quick note: if we have a "produces" attributes...what else might we have?
		 * 
		 * "consumes" is what data format the user is GIVING you.
		 * "produces" is what data format YOU are giving the user.
		 */
		
		return new ResponseEntity<Food>(foodRepo.selectById(id), HttpStatus.I_AM_A_TEAPOT);
	}
	
	
	@DeleteMapping(value="{trevin}/getFoodByUri/{chester}")
	public @ResponseBody Food getFoodByUri(@PathVariable("trevin") int num, @PathVariable("chester") String num2) {
		System.out.println(num2);
		return foodRepo.selectById(num);
	}
	
	
	@PostMapping(value="/createFood")
	public @ResponseBody String createNewFood(@RequestBody Food incomingFood) {
		/*
		 * If the incoming JSON doesn't have ALL the necessary Food model fields,
		 * then Spring will simply give the missing Food model fields their
		 * default values in java.
		 * ALSO, if the incoming JSON has MORE fields than the Food model, 
		 * then the extra fields will simply be ignored.
		 */
		
		foodRepo.insert(incomingFood);
		return "success";
	}
	
	@GetMapping(value="/lookAtTheseHeaders")
	public  ResponseEntity<String> allHeaders(@RequestHeader Map<String, String> allHeaders){
		//this look has NOTHING to do with Spring MVC, it is just
		//how you print Map key-value pairs
		for(Entry<String,String> entry: allHeaders.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		//prepare RESPONSE HEADERS
		HttpHeaders resHeader = new HttpHeaders();
		resHeader.set("You gotta follow  through", "Jerry");
		resHeader.set("Square your shoulders", "Wel, it's both");
		
		return new ResponseEntity<String>("Success", resHeader, HttpStatus.I_AM_A_TEAPOT);
	}
	//you can ALSO retrieve headers more directly
	//public ResponseEntity<String> allHeaders(
	//				@RequestHeader(value="header-name") String mySpecificHeader){
	
	
	
	
	////////INITIAL VALUES//////////////////
	private void helperIntialValues() {
		Food food1 = new Food("Buffalo Chicken", 0);
		Food food2 = new Food("Orange Chicken", 600.5);
		Food food3 = new Food("Sesame Chicken", 1000.0);
		Food food4 = new Food("General Tso Chicken", 800.0);
		Food food5 = new Food("Lemon Chicken", 200.0);
		
		foodRepo.insert(food1);
		foodRepo.insert(food2);
		foodRepo.insert(food3);
		foodRepo.insert(food4);
		foodRepo.insert(food5);
	}
	
	
}
