package com.olive.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		try {
			Employee e=new Employee();
			e.setEid(1010);
			e.setName("Ravi Kumar");
			String json=new ObjectMapper().writeValueAsString(e);
			System.out.println("JSON _Format Convertor  :: " + json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
