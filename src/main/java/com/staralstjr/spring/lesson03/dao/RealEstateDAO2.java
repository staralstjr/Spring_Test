package com.staralstjr.spring.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.staralstjr.spring.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO2 {
	public List<RealEstate> selectRealEstateList(@Param("rentPrice") int rentPrice);
}
