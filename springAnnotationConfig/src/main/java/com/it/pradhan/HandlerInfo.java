package com.it.pradhan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hob")
public class HandlerInfo {
	
	@Value("data")
	private String  reolverCode;
	@Value("temp")
	private String pathToStore;

	public HandlerInfo() {
		super();
	}

	@Override
	public String toString() {
		return "HandlerInfo [reolverCode=" + reolverCode + ", pathToStore=" + pathToStore + "]";
	}

}
