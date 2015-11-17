package com.nicholas.fastmedicineserver.integration;

import java.io.IOException;

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
}
