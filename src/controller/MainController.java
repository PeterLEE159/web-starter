package controller;

import javax.servlet.http.HttpServletRequest;

import common.Controller;

public class MainController extends Controller {

	@Override
	public String process(HttpServletRequest request) {
		return "index.jsp";
	}
	
}
