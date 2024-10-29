package com.it.pradhan;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportService {
	
	@Scheduled(fixedRate = 2000)
	public void generateReport() {
		System.out.println("Hello" + new Date());
	}

}
