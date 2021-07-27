package com.staralstjr.spring.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staralstjr.spring.lesson03.bo.RealEstateBO;
import com.staralstjr.spring.lesson03.model.RealEstate;

@RestController
public class RealEstateController {
	@Autowired
	private RealEstateBO realEstateBO;

	@RequestMapping("/lesson03/test01/1")
	public RealEstate ex01(@RequestParam("id") int id) {
		return realEstateBO.getRealEstate(id);
	}
	
	@RequestMapping("/lesson03/test01/2")
	public List<RealEstate> test02(@RequestParam("rentPrice") int rentPrice){
		return realEstateBO.getRealEstateList1(rentPrice);
	}
	
	@RequestMapping("/lesson03/test01/3")
	public List<RealEstate> test03(@RequestParam("area") int area, @RequestParam("price") int price){
		return realEstateBO.getRealEstateList2(area, price);
	}
	
	@RequestMapping("/lesson03/test02/1")
	public String test02_1() {
		RealEstate realEstate = new RealEstate();
		
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateBO.addRealEstate(realEstate);
		
		return "입력 성공 : " + count;
	}
	
	@RequestMapping("/lesson03/test02/2")
	public String test02_2(
			@RequestParam("realtorId") int realtorId) {
		int count = realEstateBO.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "입력 성공 : " + count;
	}
	
	@RequestMapping("/lesson03/test03")
	public String test03(
			@RequestParam("id") int id,
			@RequestParam("type") String type,
			@RequestParam("price") int price) {
		int count = realEstateBO.updateRealEstate(id, type, price);
		return "update 성공 : " + count;
	}
	
	@RequestMapping("/lesson03/test04")
	public String test04(
			@RequestParam("id") int id) {
		int count = realEstateBO.deleteRealEstate(id);
		return "delete 성공 : " + count;
	}
}

	
