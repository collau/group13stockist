package nus.iss.sa45.team13.stockist.services;

import org.springframework.beans.factory.annotation.Autowired;

import nus.iss.sa45.team13.stockist.model.LocalinventoryList;

import nus.iss.sa45.team13.stockist.repository.LocalInventoryListRepository;

public class LocalInventoryListServiceImpl implements LocalInventoryListService {

	@Autowired
	private LocalInventoryListRepository localRepository;

	@Override
	public LocalinventoryList findOne(int storeqty) {
		
		return localRepository.findOne(storeqty);
	}
	
	

}
