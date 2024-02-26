package com.nyeong.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyeong.spring.test.jsp.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	public int addSeller(String nickname, double temperature, String profileImage) {
		int count = sellerRepository.insertSeller(nickname, temperature, profileImage);
		
		return count;
	}
}
