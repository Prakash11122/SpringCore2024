package com.it.pradhan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AdvProcessImpl implements IProcess{

	@Override
	public void getProcesCode() {
		System.out.println("P2");
		
	}
	
	

}
