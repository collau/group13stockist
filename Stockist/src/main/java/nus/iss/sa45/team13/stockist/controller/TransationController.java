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
	private TransationDetailsService tranDetailsService;
	
	@RequestMapping(value = "/translist", method = RequestMethod.GET)
	public ModelAndView tranListPage() {
		ModelAndView mav = new ModelAndView("translist");
		List<Transation> transationList = tranService.findAll();
		mav.addObject("translist", transationList);
		return mav;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView newTranRrecordPage() {
		Transation t=new Transation();
		ModelAndView mav = new ModelAndView("transation-new", "transation", t);
		mav.addObject("transation", tranService.createTranstion(t));
		return mav;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView newTranRrecordPage(@ModelAttribute @Valid Transation transation, BindingResult result,
			final RedirectAttributes redirectAttributes) {

	//	if (result.hasErrors())
	//		return new ModelAndView("student-new");

		ModelAndView mav = new ModelAndView();
		tranService.createTranstion(transation);
		mav.setViewName("redirect:/tranlist");

		//redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
	
	@RequestMapping(value = "/trandetailslist", method = RequestMethod.GET)
	public ModelAndView tranDetailsListPage() {
		ModelAndView mav = new ModelAndView("trandetails-list");
		List<TransationDetails> trandetailslist = tranDetailsService.findAll();
		mav.addObject("trandetailslist", trandetailslist);
		return mav;
	}
	
	@RequestMapping(value = "/createdetails", method = RequestMethod.GET)
	public ModelAndView newTranDetailsRrecordPage() {
		TransationDetails t=new TransationDetails();
		ModelAndView mav = new ModelAndView("transationdetails-new", "transationdetails", t);
		mav.addObject("transationdetails", tranDetailsService.createTransationDetails(t));
		return mav;
	}
	
	@RequestMapping(value = "/createdetais", method = RequestMethod.POST)
	public ModelAndView newTranDetailsRrecordPage(@ModelAttribute @Valid TransationDetails transationdetails, BindingResult result,
			final RedirectAttributes redirectAttributes) {

	
		ModelAndView mav = new ModelAndView();
		tranDetailsService.createTransationDetails(transationdetails);
		mav.setViewName("redirect:/trandetailslist");

		return mav;
	}



}
