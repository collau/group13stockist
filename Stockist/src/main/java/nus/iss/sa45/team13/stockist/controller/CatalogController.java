package nus.iss.sa45.team13.stockist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import nus.iss.sa45.team13.stockist.model.Product;
import nus.iss.sa45.team13.stockist.services.CatalogService;

@Controller
public class CatalogController {
	
	@Autowired
	private CatalogService cService;
	
	@RequestMapping(value= {"/catalog"})
	public ModelAndView ProductListPage() {
		List<Product> catalog = cService.findAllProducts();
		ModelAndView mav = new ModelAndView("catalogpage", "catalog", catalog);
		return mav;
	}
}
