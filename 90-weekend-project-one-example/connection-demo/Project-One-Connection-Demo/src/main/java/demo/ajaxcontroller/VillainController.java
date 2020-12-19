package demo.ajaxcontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import demo.model.SuperVillain;
import demo.service.SuperVillainService;
import demo.service.SuperVillainServiceImpl;

public class VillainController {
	
	public static SuperVillainService myServ= new SuperVillainServiceImpl();

	public static void allFinder(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException, IOException {
		/*
		 * THIS IS WHERE YOU'D GO TO THE DATABASE TO GET THE OBJECTS TO SEND TO THE CLIENT
		 */


		List<SuperVillain> myVillList = myServ.getAllVillains();
		
		//in project 1 you ALREADY HAVE THE USER'S INFORMATION IN YOUR SESSION....NO NEED TO GO TO THE DATABASE
		//HttpSession session = req.getSession(); //extract the username password....then go to the DB using that username to
		//														get the reimbursmenets

		response.getWriter().write(new ObjectMapper().writeValueAsString(myVillList));
		
	}

}
