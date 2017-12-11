package nus.iss.sa45.team13.stockist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import nus.iss.sa45.team13.stockist.model.Product;
import nus.iss.sa45.team13.stockist.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService pService;
	
	@RequestMapping(value="/viewproduct/{partNumber}", method = RequestMethod.GET)
	
	public ModelAndView ProductDetails(@PathVariable int partNumber) {
//	Product product = new Product();
		return new ModelAndView("viewproduct");
}
		

		
	
}
