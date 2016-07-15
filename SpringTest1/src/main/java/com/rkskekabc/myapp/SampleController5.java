package com.rkskekabc.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rkskekabc.myapp.domain.ProductVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SampleController5 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON(){
		logger.info("doJSON called..............");
		ProductVO vo = new ProductVO("샘플 상품", 30000);
		
		return vo;
	}
}
