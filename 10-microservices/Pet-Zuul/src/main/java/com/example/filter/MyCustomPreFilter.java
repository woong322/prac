package com.example.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyCustomPreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		/*
		 * This method's boolean return value deetermines whether or not this filter's
		 * logic should be executed. You may create complex logic here if you'd like
		 * OR you can just return "true" to have the filter ALWAYS execute
		 * 
		 * 
		 * if(certainCondition)
		 * 	return true
		 * else
		 * 	return false
		 */
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// this is pretty much your filter's main method
		RequestContext cont= RequestContext.getCurrentContext();
		HttpServletRequest myReq = cont.getRequest();
		
		System.out.println("this method: "+myReq.getMethod());
		System.out.println("also: "+myReq.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
		/*
		 * return a string of "pre", "route", "post", or "error"
		 * Zuul will parse the String to figure out what type of filter this
		 * class should represent.
		 * 
		 * pre-executes BEFORE the request is routed to the proper services
		 * route- doctors the URL/routing information/destination
		 * post- executes AFTER the request has gone and come back with a response
		 * error- executes when something goes wrong (like a 500 error happens)
		 */
		return "pre";
	}

	@Override
	public int filterOrder() {
		/*
		 * If you have MANY filters of the same type then you can set a
		 * precedence order to them.
		 * numeric order will be the order that the filters trigger
		 */
		return 0;
	}

}
