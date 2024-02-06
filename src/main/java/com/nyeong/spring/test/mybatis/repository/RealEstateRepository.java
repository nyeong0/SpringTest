package com.nyeong.spring.test.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nyeong.spring.test.mybatis.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
	
	public RealEstate realEstateId(@Param("id") int id);
	
	public RealEstate realEstateRentPrice(@Param("rentPrice") int rent);
	
	public RealEstate realEstateInfo(@Param("area") int area, @Param("price") int price);
	
	
}
