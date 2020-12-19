package demo.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardRequestHelper {

	public static String process(HttpServletRequest req, HttpServletResponse res) {

		System.out.println(req.getRequestURI());
		
		
		switch(req.getRequestURI()) {
		case "/Project-One-Connection-Demo/api/forward/goHome":
			return "/resources/html/home.html";
			default:
				return "/resources/html/badlogin.html";
		}
	}
}
