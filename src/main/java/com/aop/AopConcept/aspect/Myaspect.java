package com.aop.AopConcept.aspect;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@EnableAspectJAutoProxy
@Aspect
public class Myaspect {

	@Before("execution(* )")
	public void printBefore()
	{
		System.out.println("payment before print");
	}
}
