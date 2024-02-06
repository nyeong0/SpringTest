package com.nyeong.spring.test.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyeong.spring.test.mybatis.domain.RealEstate;
import com.nyeong.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	
	public RealEstate getRealEstateId(int id){
		RealEstate realEstate = realEstateRepository.realEstateId(id);
		return realEstate;
	}
	
	public RealEstate realEstateRentPrice(int rent){
		RealEstate rentPrice = realEstateRepository.realEstateRentPrice(rent);
		return rentPrice;
	}
	
	public RealEstate realEstateInfo(int area, int price) {
		RealEstate areaPriceInfo = new RealEstate(area, price);
		areaPriceInfo = realEstateRepository.realEstateInfo(area, price);
		
		return areaPriceInfo;
	}

}
