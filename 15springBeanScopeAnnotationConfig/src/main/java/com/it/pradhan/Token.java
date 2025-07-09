package com.it.pradhan;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pkp")
//@Scope("singleton")
@Scope("prototype")
public class Token {
	
	private int code;

	public Token() {
		super();
		 code = Math.abs( new Random().nextInt() );
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}

	
	
	

}
