package com.example.aspects;

import java.io.FileNotFoundException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
 * Much like how Hibernate annotations implement JPA annotations...
 * Spring AOP creates an implementation of aspectj. It simplifies
 * aspectj BUT it reduces certain functionalities as a result.
 * Basically, Spring AOP0 abstract aspectj a bit.
 * 
 * What is an Aspect?
 * An aspect is a modularization of CCCs.
 * In Java, it takes the form of a Class. You can ALSO think of an aspect
 * as a collection of advice.
 */
@Component("myAspect")
@Aspect
public class AspectExample {
	/*
	 * What is an advice?
	 * An advice is an action taken by an aspect. In Spring AOP advice is triggered by method invocations
	 * 
	 * In Java, advice take the form of a method
	 * 
	 * What are types of advice (aka advice timings):
	 * 	@Before- executes before the method runs
	 * 	@After-	executes after the method runs (regardless of success)
	 * 	@AfterReturning- executes after returning (even if the return is void)
	 * 	@AfterThrowing- executes after an exception/error has been thrown
	 * 	@Around- well...it's the most powerful. It can execute logic before OR after the method and even
	 * 		have control during
	 * 
	 * 
	 * JoinPoints are the possible points in the runtime of the program WHERE an advice can be invoked.
	 * In Spring AOP, JoinPoints take the form of an object inject into the advice; this object
	 * contains information about the current state of the runtime
	 * (remember, in Spring AOP advice are themselves triggered by method invocations)
	 * 
	 * Pointcut are expression that are used to select SPECIFIC JoinPoints.
	 * 
	 * Point expression symbols:
	 * "*"		is our wildcard for return types and method naming
	 * ".."		is our wildcard for our parameter list (for any number of parameters)
	 * "*"		is ALSO our wildcard for a SINGLE parameter in the parameter list
	 */

	//@Before("execution(* *(..))") 			//<------this string is called the "Pointcut Expression"
	//@Before("execution(* draw*(..))") 		//target method's name
	//@Before("execution(* d***r*****a*w*(..))") //we can have many wildcards
	//@Before("execution(int draw*(..))") 		//target return types
	//@Before("execution(protected * draw*(..))")	//target access modifiers
	//@Before("execution(* *(int))")			//target parameter list
	//@Before("!execution(* draw*(..))") 			//not operator
	//@Before("execution(* *(int)) || execution(* sculpt*(..))")
	//@Before("execution(* *(int, ..))")
	//@Before("execution(* *(.., char))")
	//@Before("execution(* *(.., int, ..))")
	//@Before("execution(* *(int, *))")
	//@Before("execution(* com.example.MyAppProxy.draw*(..))")
	@Before("execution(* *(..))")
	public void bTask(JoinPoint jp) {
		//System.out.println("play our sick beats");
//		System.out.println(jp.getSignature());
//		System.out.println(jp.getSignature().getModifiers());
//		System.out.println(jp.getArgs().length);
		
	}
	
//	@After("execution(* sculpt*(..))")
//	public void aTask(JoinPoint jp) {
//		System.out.println("post on social media");
//		System.out.println("------------------------------");
//	}
	
//	@AfterReturning("execution(* *sculpt*(..))")
//	public void afterTaskReturn(JoinPoint jp) {
//		System.out.println("returning advice");
//	}
	
//	@AfterThrowing(pointcut="execution(* *sculpt*(..))", throwing="exc")
//	public void afterTaskThrow(JoinPoint jp, FileNotFoundException exc) {
//		//note: if the target method CATCHES the exception, then this advice will not trigger
//		System.out.println("throwing advice");
//	}
	
	/* 
	 *	AROUND EXAMPLE 
	 */
	@Around("execution(* scul*(..))")
	public void testAroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("wettin the clay");
		pjp.proceed();
		System.out.println("cleaning up the clay");
		pjp.proceed();
		System.out.println("final message");
	}
}
