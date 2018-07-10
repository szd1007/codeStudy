package org.adamx.springtest.aop;

import org.springframework.stereotype.Component;

@Component
public class Juggler implements Performance {
	private int beanBags = 3;
	public Juggler(){}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("Juggling  " + beanBags + " beanbags");
	}
}
