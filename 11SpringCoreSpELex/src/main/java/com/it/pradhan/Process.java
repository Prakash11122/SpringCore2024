 package com.it.pradhan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Process {
	//@Value("#{ 2 + 3 }")
	//@Value("#{'Helloooooo'.length()}")
	//@Value("#{ new java.util.Random().nextInt() }")
	//@Value("#{ T(java.lang.Math).abs(-9)}")
	//@Value(" #{ T(java.lang.Math).abs( new java.util.Random().nextInt() ) }")
	//@Value(" #{ 'Hello'.length() > 0 ? 55 : 44 }")
	//@Value(" #{ modelData.model.length() }")
	//@Value(" #{ modelData.model.toLowerCase() }")
	private String code;
	
	//@Value("#{ false }")
		//@Value(" #{ new java.util.Random().nextInt() > 5 ? true:false}")
		//@Value(" #{ new java.util.Random().nextInt() > 5 }")
		//@Value(" #{ new java.util.Random().nextInt() ge 5 }")
		//@Value(" #{ 5 % 2 > 0 && 2 + 3 le 5  }")
		@Value(" #{ 5 % 2 > 0 and 2 + 3 le 5  }")
		private boolean isPresent;

		@Override
		public String toString() {
			return "Process [code=" + code + ", isPresent=" + isPresent + "]";
		}

	
	
	
	

}
