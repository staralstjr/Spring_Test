package com.staralstjr.spring.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.staralstjr.spring.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {
	public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateList1(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstateList2(@Param("area") int area, @Param("price") int price);
}
