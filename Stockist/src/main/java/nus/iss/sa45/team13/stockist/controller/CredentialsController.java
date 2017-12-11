package nus.iss.sa45.team13.stockist.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CredentialsController {

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView LoginPage(Authentication authentication) {
		ModelAndView mav = new ModelAndView();

		if (authentication != null && authentication.isAuthenticated()) {
			// If logged in goto home page
			mav.setViewName("redirect:/home");
		} else {
			// Otherwise show login page as usual
			mav.setViewName("login");
		}

		return mav;
	}

	@RequestMapping(value = { "/home", "/" }, method = RequestMethod.GET)
	public ModelAndView GotoHomePage(Authentication authentication) {
		ModelAndView mav = new ModelAndView();

		if (authentication != null && authentication.isAuthenticated()) {
			String name = authentication.getName();
			String role = authentication.getAuthorities().toString();

			if (role.equals("[Admin]")) {
				System.out.println("REDIRECTING TO ADMIN PAGE...");
			} else if (role.equals("[Staff]")) {
				System.out.println("REDIRECTING TO STAFF PAGE...");
			}

			// TODO : If logged in goto to homepage based on role
			mav.setViewName("redirect:/about");
		} else {
			// If not logged in, redirect to about page
			mav.setViewName("redirect:/about");
		}

		return mav;
	}
}
