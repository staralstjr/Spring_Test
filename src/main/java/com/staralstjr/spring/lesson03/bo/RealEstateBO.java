package com.staralstjr.spring.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staralstjr.spring.lesson03.dao.RealEstateDAO;
import com.staralstjr.spring.lesson03.model.RealEstate;

@Service
public class RealEstateBO {
	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(int id) {
		return realEstateDAO.selectRealEstate(id);
	}
	public List<RealEstate> getRealEstateList1(int rentPrice) {
		return realEstateDAO.selectRealEstateList1(rentPrice);
	}
	public List<RealEstate> getRealEstateList2(int area, int price){
		return realEstateDAO.selectRealEstateList2(area, price);
	}


}

