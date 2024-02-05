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
	private StoreService storeServise;
	
	@ResponseBody
	@RequestMapping("/db/store/list")
	public List<Store> storeList(){
		List<Store> storeList = storeServise.getStoreList();
		return storeList;
	}
	
}
