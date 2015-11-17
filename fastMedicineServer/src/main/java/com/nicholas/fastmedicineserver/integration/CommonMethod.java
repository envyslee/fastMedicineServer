package com.nicholas.fastmedicineserver.integration;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonMethod
{
	public static String Obj2Json(Object obj) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(obj);

			return json;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	
	
	public static boolean isMobileNum(String num)
	{
		String regExp = "^[1][3,4,5,7,8][0-9]{9}$";  
		Pattern p = Pattern.compile(regExp);  
		Matcher m = p.matcher(num);  
		return m.matches();
	}
}
