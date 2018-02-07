package org.adamx.springtest;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContextTest {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:performer.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
	}
}
