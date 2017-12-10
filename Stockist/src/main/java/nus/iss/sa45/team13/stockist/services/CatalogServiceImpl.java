package nus.iss.sa45.team13.stockist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.sa45.team13.stockist.model.Product;
import nus.iss.sa45.team13.stockist.repository.ProductRepository;

@Service
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private ProductRepository productRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see nus.iss.sa45.team13.stockist.services.CatalogService#findAllProducts()
	 */
	@Override
	public ArrayList<Product> findAllProducts() {

		ArrayList<Product> al = (ArrayList<Product>) productRepository.findAll();
		return al;
	}

	@Override
	public Product findOne(int a) {
		// TODO Auto-generated method stub
		Product p = productRepository.findOne(a);
		return p;
	}

}
