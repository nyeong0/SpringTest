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
	
	
}
