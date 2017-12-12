package nus.iss.sa45.team13.stockist.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import nus.iss.sa45.team13.stockist.model.Product;
import nus.iss.sa45.team13.stockist.services.ProductService;

@Controller
public class ProductController {

	
	
	@Autowired
	private ProductService pService;
	
	Map<Integer,Integer> saved = new HashMap<Integer,Integer>();

	@RequestMapping(value = "/viewproduct/{partNumber}", method = RequestMethod.GET)
	public ModelAndView ProductDetails(@PathVariable int partNumber) {

		Product product = pService.findOne(partNumber);
		ModelAndView mav = new ModelAndView("viewproduct", "currentproduct", product);
		return mav;

	}

	// @RequestMapping(value = "/person-form")
	// public ModelAndView personPage() {
	// return new ModelAndView("person-page", "person-entity", new Person());
	// }

//	 @RequestMapping(value = "/viewproduct/record")
//	 public ModelAndView processProduct(@ModelAttribute Product product) {
//	 ModelAndView mav = new ModelAndView();
//	 mav.setViewName("redirect:/catalog");
//	
//	 mav.addObject("productObj", product);
//	
//	 return mav;
//	 }

	@RequestMapping(value = "/viewproduct/{partNumber}", method = RequestMethod.POST)
	public ModelAndView AddToCart(@ModelAttribute Product savedQty, BindingResult result,
			RedirectAttributes redirectAttributes, HttpSession httpSession, @PathVariable int partNumber) {

		
		
		Product savedproduct = pService.findOne(partNumber);
		System.out.println("savedproduct found" + savedproduct.toString());
		
		saved.put(partNumber, savedQty.getPartNumber());
		
		httpSession.setAttribute("saved", saved);
		
		Set set = saved.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("partnumber is "+ mentry.getKey() + "qty is ");
			System.out.println(mentry.getValue());
		}
		
		
		System.out.println("Productsesson found" + ((Map<Integer, Integer>) httpSession.getAttribute("saved")).get(partNumber));
		ModelAndView mav = new ModelAndView("redirect:/catalog");
		return mav;
	}

}
