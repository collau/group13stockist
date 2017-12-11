package nus.iss.sa45.team13.stockist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import nus.iss.sa45.team13.stockist.model.RegisterForm;
import nus.iss.sa45.team13.stockist.model.Role;
import nus.iss.sa45.team13.stockist.model.User;
import nus.iss.sa45.team13.stockist.repository.RoleRepository;
import nus.iss.sa45.team13.stockist.repository.UserRepository;

@Controller
public class CredentialsController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;

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
			//String name = authentication.getName();
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
	
	@RequestMapping(value = "/admin/register", method = RequestMethod.GET)
	public ModelAndView StartRegistration() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		
		mav.addObject("userDetails", new RegisterForm());
		return mav;	
	}
	
	@RequestMapping(value = "/admin/register", method = RequestMethod.POST)
	public ModelAndView CompleteRegistration(@ModelAttribute RegisterForm userDetails, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		Role role = new Role();
		User user = new User();
		
		// Now that the data is validated, register the user
		user.setUserId(userDetails.getUserName());
		user.setPassword(userDetails.getPassword());
		role.setName(userDetails.getName());
		role.setRole(userDetails.isAdminStatus() ? "Admin" : "Staff");
		
		// Save data to table
		role = roleRepo.save(role);
		user.setStaffId(role.getStaffId());
		user = userRepo.save(user);
		
		mav.addObject("newUser", userDetails);
		mav.setViewName("confirmRegistration");
		
		return mav;		
	}
	
	@RequestMapping(value = "/admin/confirmRegistration")
	public ModelAndView ConfirmRegistration(@ModelAttribute RegisterForm userDetails, BindingResult result) {
		ModelAndView mav = new ModelAndView("confirmRegistration");
		return mav;
	}
}
