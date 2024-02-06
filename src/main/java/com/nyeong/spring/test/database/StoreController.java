package com.nyeong.spring.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nyeong.spring.test.database.domain.Store;
import com.nyeong.spring.test.database.service.StoreService;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@ResponseBody
	@RequestMapping("/db/store/list")
	public List<Store> storeList(){
		
		// 가게 정보 리스트를  json으로 response에 담는다
		// Store 관련 Service Class의 메소드를 통해 가게 정보 리스트를 얻어 온다.
		List<Store> storeList = storeService.getStoreList();
		
		return storeList;
	}
	
}
