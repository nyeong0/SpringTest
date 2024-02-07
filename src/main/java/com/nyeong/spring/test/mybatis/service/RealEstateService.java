package com.nyeong.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyeong.spring.test.mybatis.domain.RealEstate;
import com.nyeong.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	
	public RealEstate getRealEstateId(int id){
		RealEstate realEstate = realEstateRepository.selectRealEstateId(id);
		return realEstate;
	}
	
	// 여러개 조회 가능 List
	public List<RealEstate> realEstateRentPrice(int rent){
		List<RealEstate> rentPriceList = realEstateRepository.realEstateRentPrice(rent);
		return rentPriceList;
	}
	
	public List<RealEstate> realEstateInfo(int area, int price) {
		List<RealEstate> areaPriceInfo =  realEstateRepository.realEstateInfo(area, price);
		
		return areaPriceInfo;
	}

}
