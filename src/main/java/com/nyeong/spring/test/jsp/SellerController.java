package com.nyeong.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nyeong.spring.test.jsp.domain.Seller;
import com.nyeong.spring.test.jsp.service.SellerService;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/create")
	@ResponseBody
	public String createSeller(
			@RequestParam("nickname") String nickname
			,@RequestParam("temperature") double temperature
			,@RequestParam("profileImage") String profileImage){
		int count = sellerService.addSeller(nickname, temperature, profileImage);
		
		return "수행결과 : " + count;
	}
	
	
	@GetMapping("/input")
	public String inputSeller() {
		return "jsp/sellerInput";
	}
	
	@GetMapping("/info")
	public String sellerInfo(@RequestParam(value="id", required=false) Integer id, Model model) {
		
		Seller seller = null;
		if(id != null) {
			// id가 전달되면, 일치하는 판매자 정보
			 seller = sellerService.getSeller(id);
			 
		}else {
			// id가 전달되지 않으면, 가장 최근 등록된 판매자 정보
			 seller = sellerService.getLastSeller();
		}
		
		model.addAttribute("seller", seller);
		return "jsp/sellerInfo";
	}
	
//	@GetMapping("/info/id")
//	public String sellerInfoById(@RequestParam int id, Model model) {
//		
//		Seller seller = sellerService.getSeller(id);
//		model.addAttribute("seller", seller);
//		
//		return "jsp/sellerInfo";
//	}
	
	
}
