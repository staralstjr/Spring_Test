package com.staralstjr.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.staralstjr.spring.lesson04.bo.SellerBO;
import com.staralstjr.spring.lesson04.model.Seller;

@RequestMapping("/lesson04")
@Controller
public class SellerController {
	@Autowired
	private SellerBO sellerBO;
	
	@GetMapping("/test01/1")
	public String getSellerInfo(Model model) {
		Seller seller = sellerBO.getLastSeller();
		
		model.addAttribute("result", seller);
		model.addAttribute("subject", "판매자 추가");
		
		return "lesson04/sellerInfo";
	}
	
	@RequestMapping("/test01/seller_info")
	public String sellerInfo() {
		
		return "lesson04/sellerAdd";
	}
}
