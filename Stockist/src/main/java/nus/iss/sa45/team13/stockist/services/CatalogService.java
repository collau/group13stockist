package nus.iss.sa45.team13.stockist.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import nus.iss.sa45.team13.stockist.model.Product;


public interface CatalogService {

	ArrayList<Product> findAllProducts();

}