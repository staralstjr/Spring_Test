package com.staralstjr.spring.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.staralstjr.spring.lesson04.model.Seller;

@Repository
public interface SellerDAO {
	public int insertSeller(
		@Param("nickname") String nickname
		, @Param("profileImageUrl") String profileImageUrl
		, @Param("temperature") double temperature
		);
	
	public Seller selectLastSeller();
}
