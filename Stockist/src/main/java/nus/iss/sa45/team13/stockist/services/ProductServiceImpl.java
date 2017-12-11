package nus.iss.sa45.team13.stockist.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.sa45.team13.stockist.model.Product;
import nus.iss.sa45.team13.stockist.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product findOne(int a) {
		// TODO Auto-generated method stub
		Product p = productRepository.findOne(a);
		return p;
	}
	
	@Override
	public ArrayList<Product> findAllProducts() {

		ArrayList<Product> al = (ArrayList<Product>) productRepository.findAll();
		return al;
	}
	
}
