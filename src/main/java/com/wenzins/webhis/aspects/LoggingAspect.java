package com.wenzins.webhis.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	Logger logger = Logger.getRootLogger();

	@Before("execution(* com.wenzins.webhis..*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.info("logBefore() is running!");
		logger.info("hijacked : " + joinPoint.getSignature().getName());

		logger.info("ClassName :: "
				+ joinPoint.getTarget().getClass().getCanonicalName()
				+ " MethodName:: " + joinPoint.getSignature().toLongString());

		logger.debug("Debug ClassName :: "
				+ joinPoint.getTarget().getClass().getCanonicalName()
				+ " MethodName:: ");
		for (Object o : joinPoint.getArgs()) {
			logger.debug("Argument::" + o + ",");
		}
	}

}