package com.nyeong.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@ResponseBody
	public String createRealEstateByObject() {
		
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateService.addRealEstateByObject(realEstate);
		
		return "입력 성공 : " + count;
	}
	
	@RequestMapping("/insert/2")
	@ResponseBody
	public String createRealEstate(@RequestParam("realtorId") int realtorId) {
		int count = realEstateService.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 1000000, 120);
		return "입력성공 : " + count;
	}
	
	// id가 23인 매물정보에 type을 전세로, 보증금은 80000으로 변경
	@RequestMapping("/update")
	@ResponseBody
	public String updateRealEstate() {
		int count = realEstateService.updateRealEstate(23, "전세", 80000);
		return "수정 성공: " + count;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteRealEstate(@RequestParam("id") int id) {
		int count = realEstateService.deleteRealEstate(id);
		return "삭제 성공 : " + count;
	}
	
	
}
