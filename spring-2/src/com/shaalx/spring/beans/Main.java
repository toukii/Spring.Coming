package com.shaalx.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*HelloSpring hs = new HelloSpring();
		
		hs.setName("Spring");
		
		hs.hello();*/
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloSpring hs = (HelloSpring)ctx.getBean("helloBean");
		
		hs.hello();
	}
}
