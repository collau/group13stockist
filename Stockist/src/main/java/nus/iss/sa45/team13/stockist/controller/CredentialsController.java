package nus.iss.sa45.team13.stockist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CredentialsController {

	@RequestMapping(value= {"/login"}, method = RequestMethod.GET)
	public ModelAndView LoginPage() {
		// TODO : Catch People already logged in
		ModelAndView mav = new ModelAndView("login");		
		return mav;
	}
}
