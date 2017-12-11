package nus.iss.sa45.team13.stockist.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import nus.iss.sa45.team13.stockist.model.Transation;
import nus.iss.sa45.team13.stockist.model.TransationDetails;
import nus.iss.sa45.team13.stockist.services.TransationDetailsService;
import nus.iss.sa45.team13.stockist.services.TransationService;

@Controller
public class TransationController {
	
	@Autowired
	private TransationService tranService;
	
	
	@RequestMapping(value = "/translist", method = RequestMethod.GET)
	public ModelAndView tranListPage() {
		ModelAndView mav = new ModelAndView("translist");
		List<Transation> transationList = tranService.findAll();
		mav.addObject("translist", transationList);
		return mav;
	}
	
	@RequestMapping(value = "/createtran", method = RequestMethod.GET)
	public ModelAndView newTranRrecordPage() {
		Transation t=new Transation();
		ModelAndView mav = new ModelAndView("translist", "transation", t);
		mav.addObject("transation", tranService.newTranRrecordPage(t));
		return mav;
	}
	
	@RequestMapping(value = "/createtran", method = RequestMethod.POST)
	public ModelAndView newTranRrecordPage(@ModelAttribute @Valid Transation transation, BindingResult result,
			final RedirectAttributes redirectAttributes) {

	//	if (result.hasErrors())
	//		return new ModelAndView("student-new");

		ModelAndView mav = new ModelAndView();
		tranService.newTranRrecordPage(transation);
		mav.setViewName("redirect:/tranlist");

		//redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	
	
	


}
