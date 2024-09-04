package com.phdareys.bank.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.phdareys.bank.bean.BankLoan;


public class BankController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"applicationContext.xml"});
		for (String bName: appContext.getBeanDefinitionNames()) {
			BankLoan simu = (BankLoan)appContext.getBean(bName);
			simu.run();
			System.out.println (simu);
		}
		appContext.close();
	}
}
