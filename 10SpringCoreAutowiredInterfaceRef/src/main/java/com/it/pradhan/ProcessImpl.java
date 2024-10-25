package com.it.pradhan;

import org.springframework.stereotype.Component;

@Component("pob")
public class ProcessImpl implements IProcess {

	@Override
	public void getProcesCode() {
		System.out.println("P1");

	}

}
