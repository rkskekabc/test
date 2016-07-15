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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rkskekabc.myapp.domain.ProductVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SampleController4 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr){
		logger.info("doE called..............");
		rttr.addFlashAttribute("msg", "This is the Message!! with redirect");
		return "redirect:doF";
	}
	
	@RequestMapping("doF")
	public String doF(@ModelAttribute("msg") String msg){
		logger.info("doF called..............." + msg);
		return "result";
	}
}
