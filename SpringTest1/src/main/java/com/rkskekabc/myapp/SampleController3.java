package com.rkskekabc.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rkskekabc.myapp.domain.ProductVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SampleController3 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("doD")
	public String doD(Model model){
		logger.info("doD called..............");
		ProductVO product = new ProductVO("Sample Product", 1000000);
		model.addAttribute("product", product);
		return "productDetail";
	}
}
