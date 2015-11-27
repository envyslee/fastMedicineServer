package com.nicholas.fastmedicineserver.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageControler
{
	
	@RequestMapping(value={"home","/"},method=RequestMethod.GET)
	public String login(){
		return "index.jsp";
	}
}
