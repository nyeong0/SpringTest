package com.nyeong.spring.test.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nyeong.spring.test.mybatis.domain.RealEstate;
import com.nyeong.spring.test.mybatis.service.RealEstateService;

@RestController
public class realEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/mybatis/real-estate/1")
	public RealEstate realEstate(@RequestParam("id") int id){
		RealEstate realEstate = realEstateService.getRealEstateId(id);
		return realEstate;
	}
	
	@RequestMapping("/mybatis/real-estate/2")
	public RealEstate realEstateRentPrice(@RequestParam("rentPrice") int rent){
		RealEstate rentPrice = realEstateService.realEstateRentPrice(rent);
		return rentPrice;
	}
	
	@RequestMapping("/mybatis/real-estate/3")
	public RealEstate areaPriceInfo(@RequestParam("area") int area, @RequestParam("price") int price){
		RealEstate areaPriceInfo = realEstateService.realEstateInfo(area, price);
		return areaPriceInfo;
	}
	
}
