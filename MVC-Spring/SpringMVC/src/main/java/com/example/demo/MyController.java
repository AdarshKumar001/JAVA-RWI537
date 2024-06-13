package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	//@RequestMapping(value = "/hellopage",method = RequestMethod.GET)
	@GetMapping("/hello")
	public ModelAndView openHelloPage(){
		System.out.println("openHelloPage() method executed");
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("hello");
		return mav;
	}

}
