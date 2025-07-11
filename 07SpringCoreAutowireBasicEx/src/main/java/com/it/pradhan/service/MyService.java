package com.it.pradhan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.it.pradhan.MyRepository;

@Component
public class MyService {
	
	@Autowired
	private MyRepository repo;  //Has-a
	
	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}
	

}
