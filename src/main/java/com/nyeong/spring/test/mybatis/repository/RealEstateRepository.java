package com.nyeong.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nyeong.spring.test.mybatis.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
	
	public RealEstate selectRealEstateId(@Param("id") int id);
	
	public List<RealEstate> realEstateRentPrice(@Param("rent") int rent);
	
	public List<RealEstate> realEstateInfo(
			@Param("area") int area, 
			@Param("price") int price);
	
	// 객체 기반의 레퍼지토리는 @Param 필요 없음.
	public int insertRealEstateByObject(RealEstate realEstate);
	
	public int insertRealEstate(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice);
	
}
