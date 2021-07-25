package com.staralstjr.spring.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staralstjr.spring.lesson03.dao.RealEstateDAO;
import com.staralstjr.spring.lesson03.dao.RealEstateDAO2;
import com.staralstjr.spring.lesson03.dao.RealEstateDAO3;
import com.staralstjr.spring.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(int id) {
		return realEstateDAO.selectRealEstate(id);
	}
	
	@Autowired
	private RealEstateDAO2 realEstateDAO2;
	
	public List<RealEstate> getRealEstateList(int rentPrice) {
		return realEstateDAO2.selectRealEstateList(rentPrice);
	}
	
	@Autowired
	private RealEstateDAO3 realEstateDAO3;
	
	public List<RealEstate> getRealEstateList(int area, int price){
		return realEstateDAO3.selectRealEstateList(area, price);
	}


}

