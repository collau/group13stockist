package nus.iss.sa45.team13.stockist.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.sa45.team13.stockist.model.TransationDetails;
import nus.iss.sa45.team13.stockist.repository.TransationDetailsRepository;

@Service
public class TransationDetailsServiceImpl implements TransationDetailsService {

	@Autowired
	TransationDetailsRepository transationDetailsrepository;
	
	@Override
	public ArrayList<TransationDetails> findAll() {
		ArrayList<TransationDetails> tran = (ArrayList<TransationDetails>)transationDetailsrepository.findAll();
		return tran;
	}


	@Override
	public TransationDetails findId(int tranid) {
		
		return transationDetailsrepository.findOne(tranid);
	}


	@Override
	public TransationDetails newTranRrecordPage(TransationDetails t) {
		
		return transationDetailsrepository.save(t);
	}

}
