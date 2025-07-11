package com.it.pradhan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DatabaseConnection {
	
//	@Value("${my.grade.id}")
//	private int code;
	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db-url}")
	private String url;
	@Value("${my.db_user}")
	private String userName;
	@Value("${my.db-pwd}")
	private String userpwd;
	@Override
	public String toString() {
		return "DatabaseConnection [driver=" + driver + ", url=" + url + ", userName=" + userName + ", userpwd="
				+ userpwd + "]";
	}
	
	
	
	
	
	
	

}
