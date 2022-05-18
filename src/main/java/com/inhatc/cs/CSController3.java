package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController3 {

	@RequestMapping("doO")
	public String doO(Model model) {
		ProductVO product = new ProductVO("ÄÄÇ»ÅÍ", 10000);
		System.out.println("doO Called~~~");
		model.addAttribute(product);
		return "productDetail";
	}
}
