package org.java.demo.aspectjaop.main;

import org.java.demo.aspectjaop.service.AService;
import org.java.demo.aspectjaop.service.AServiceImpl;
import org.java.demo.aspectjaop.service.BServiceImpl;

public class Main {

	public static void main(String[] args) { 
		AService aService = new AServiceImpl();
		aService.fooA("test11");
		BServiceImpl bService = new BServiceImpl();
		bService.fooB();
		bService.fooBWithAnnotation();;
	}
}
