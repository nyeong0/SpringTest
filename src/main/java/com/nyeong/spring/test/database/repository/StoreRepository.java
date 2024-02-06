package com.nyeong.spring.test.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nyeong.spring.test.database.domain.Store;

// 인터페이스 - xml 을 맵핑하는 어노테이션
@Mapper
public interface StoreRepository {
	
	// store 테이블의 모든 행을 조회하고 돌려준다.
	// List에 한 행을 객체화
	public List<Store> selectStore();
	
}
