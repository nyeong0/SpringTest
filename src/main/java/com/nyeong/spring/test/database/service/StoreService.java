package com.nyeong.spring.test.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyeong.spring.test.database.domain.Store;
import com.nyeong.spring.test.database.repository.StoreRepository;

// 기능
@Service	
public class StoreService {

	@Autowired 
	private StoreRepository storeRepository; 
	
	public List<Store> getStoreList() {
		
		List<Store> storeList = storeRepository.selectStore();
		return storeList;
		
	}
}
