package com.nyeong.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
