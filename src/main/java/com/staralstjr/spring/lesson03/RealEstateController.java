package com.staralstjr.spring.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staralstjr.spring.lesson02.model.Store;
import com.staralstjr.spring.lesson03.bo.RealEstateBO;
import com.staralstjr.spring.lesson03.model.RealEstate;

@RestController
@RequestMapping("/lesson03/test01")
public class RealEstateController {
	@Autowired
	private RealEstateBO realEstateBO;
	
	@Autowired
	private RealEstateBO realEstateBO2;
	
	@Autowired
	private RealEstateBO realEstateBO3;
	
	@RequestMapping("/1")
	public RealEstate ex01(@RequestParam("id") int id) {
		return realEstateBO.getRealEstate(id);
	}
	
	@RequestMapping("/2")
	public List<RealEstate> test02(@RequestParam("rentPrice") int rentPrice){
		return realEstateBO2.getRealEstateList(rentPrice);
	}
	@RequestMapping("/3")
	public List<RealEstate> test03(@RequestParam("area") int area, @RequestParam("price") int price){
		return realEstateBO3.getRealEstateList(area, price);
	}
}
	
