package com.zainab.spring.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zainab.spring.bean.Loan;

public class LoanController {
	
	public static void main(String []args) {
	
	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
			new String [] {"applicationContext.xml"});
	for (String bName: appContext.getBeanDefinitionNames()) {
		Loan simu = (Loan)appContext.getBean(bName);
		simu.run();
		System.out.println (simu);
	}
	
	}
}
