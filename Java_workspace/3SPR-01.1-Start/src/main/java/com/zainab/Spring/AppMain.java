package com.zainab.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] {"helloBean.xml"});
				SpringHello obj=(SpringHello)appContext.getBean("helloBean");
				SpringHello obj2=(SpringHello)appContext.getBean("helloBean2");
				SpringHello obj3=(SpringHello)appContext.getBean("helloBean3");
				System.out.println(obj.getUsername());
				System.out.println(obj2.getUsername());
				System.out.println(obj3.getUsername());
				appContext.close();
	}

}
