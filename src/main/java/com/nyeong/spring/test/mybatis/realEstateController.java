package com.nyeong.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nyeong.spring.test.mybatis.domain.RealEstate;
import com.nyeong.spring.test.mybatis.service.RealEstateService;

@RestController
@RequestMapping("/mybatis/real-estate")
public class realEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/select/1")
	public RealEstate realEstate(@RequestParam("id") int id){
		// 파라미터로 전달된 id와 일치하는 매물 정보를 json 으로 response에 담는다.
		RealEstate realEstate = realEstateService.getRealEstateId(id);
		return realEstate;
	}
	
	@RequestMapping("/select/2")				//@RequestParam파라미터 이름 : rent
	public List<RealEstate> realEstateRentPrice(@RequestParam("rent") int rent){
		List<RealEstate> rentPriceList = realEstateService.realEstateRentPrice(rent);
		return rentPriceList;
	}
	
	@RequestMapping("/select/3")
	public List<RealEstate> areaPriceInfoList(
			@RequestParam("area") int area, 
			@RequestParam("price") int price){
		List<RealEstate> areaPriceInfo = realEstateService.realEstateInfo(area, price);
		return areaPriceInfo;
	}
	
	@RequestMapping("/insert/1")
	
}
