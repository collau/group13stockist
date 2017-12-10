package nus.iss.sa45.team13.stockist.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import nus.iss.sa45.team13.stockist.model.Product;
import nus.iss.sa45.team13.stockist.services.CatalogService;

@Controller
public class CatalogController {
	
	@Autowired
	private CatalogService cService;
	
	
	@RequestMapping(value= {"/catalog"}, method = RequestMethod.GET)
	public ModelAndView CatalogPage() {
		
		Product product = new Product();
		ArrayList<Product> catalog = cService.findAllProducts();
		ModelAndView mav = new ModelAndView("catalogpage", "product", product);
		mav.addObject("catalog", catalog);
		return mav;
	}
	
	@RequestMapping(value = "/catalog", method = RequestMethod.POST)
	public ModelAndView RefinedCatalogPage(@ModelAttribute Product product, BindingResult result) {
//
//		if (result.hasErrors())
//			return new ModelAndView("department-new");
		ArrayList<Product> catalog = new ArrayList<Product>();
		Product p= cService.findOne(product.getPartNumber());
		catalog.add(p);
		ModelAndView mav = new ModelAndView("catalogpage", "catalog", catalog);
		return mav;
	}
	
	
	
}
