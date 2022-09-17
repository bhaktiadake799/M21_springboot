package com.cg.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class human {
	private heart h;
	
	public human()
	{
		this.h = h;
	}
	
	public human(heart h) 
	{
		super();
		this.h = h;
	}
	@Autowired
	@Qualifier("heart")
	public void setHeart(heart heart) 
	{
		this.h= heart;
	}

	public void startPumping()
	{
		h.pump();
		System.out.println("The name of your animal is : "+h.getNameOfAnimal()+" and the no. of heart is : "+h.getNoOfHeart());
	}

}
	
	
