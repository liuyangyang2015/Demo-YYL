package com.springinaction.knights;

import java.io.PrintStream;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Minstrel {

	private PrintStream stream;
	
	public Minstrel(PrintStream stream)
	{
		this.stream = stream;
	}
	
	@Pointcut(value = "execution(* com.springinaction.knights.Knight.embarkOnQuest(..))")
	//@Pointcut(value = "execution(* *.embarkOnQuest(..))")
	private void embark() {
	}
	
	@Before("embark()")
	public void singBeforeQuest()
	{
		stream.println("singBeforeQuest :the knight is so brave1234 !");
	}
	
	@After("embark()")
	public void singAfterQuest()
	{
		stream.println("singAfterQuest: the brave knight did embark on a quest而退 !");
	}
	
	@Around("embark()")
	public void aroundQuest(ProceedingJoinPoint jp)
	{
		try{
			stream.println("singBeforeQuest :the knight is so brave la la la  !");
			jp.proceed();
			stream.println("singAfterQuest: the brave knight did embark on a quest ha ha ha !");
			
		}
		catch(Throwable e)
		{
			stream.println("singAfterQuest: the brave knight did embark on a quest  xu xu xu !");
		}
		
	}
}
