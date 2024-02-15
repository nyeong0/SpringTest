package com.nyeong.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyeong.spring.test.mybatis.domain.RealEstate;
import com.nyeong.spring.test.mybatis.repository.RealEstateRepository;
// 서비스는 @Autowired 빼고 다 자바 코드.
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
	
	public int addRealEstateByObject(RealEstate realEstate) {
		int count = realEstateRepository.insertRealEstateByObject(realEstate);
		return count;
	}
	
	public int addRealEstate(
			int realtorId
			, String address
			, int area
			, String type
			, int price
			, int rentPrice) {
		
		int count = realEstateRepository.insertRealEstate(realtorId, address, area, type, price, rentPrice);
		
		return count;
		
	}

}
