package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capg.bean.Merchant;
import com.capg.repo.CustomerRepo;
import com.capg.repo.MerchantRepo;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantRepo repo1;
	@Override
	public void saveMerchant(String id, String password) {
		// TODO Auto-generated method stub
	

	
			// TODO Auto-generated method stub
			Merchant m=new Merchant();
			m.setId(id);
			m.setPassword(password);
			repo1.save(m);
		
	}

}
