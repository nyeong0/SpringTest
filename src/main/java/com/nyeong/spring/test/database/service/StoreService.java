package com.nyeong.spring.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyeong.spring.test.database.domain.Store;
import com.nyeong.spring.test.database.repository.StoreRepository;

// 기능
@Service
public class StoreService {
	
	// 객체 주입..
	@Autowired 
	private StoreRepository storeRepository; 
	
	// 가게 정보 리스트를 돌려주는 기능
	public List<Store> getStoreList() {
		
		// store 테이블의 가게정보 조회 결과를 Repository 메소드를 통해 얻어온다.
		List<Store> storeList = storeRepository.selectStore();
		return storeList;
		
	}
}
