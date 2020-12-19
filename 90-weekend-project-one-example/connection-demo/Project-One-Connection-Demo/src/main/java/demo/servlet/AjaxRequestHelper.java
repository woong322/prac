package demo.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.ajaxcontroller.VillainController;

public class AjaxRequestHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(request.getRequestURI());

		switch (request.getRequestURI()) {
		case "/Project-One-Connection-Demo/api/ajax/allVillains":
			VillainController.allFinder(request, response);
			break;
		default:

			response.getWriter().println("null");
		}
	}
}
