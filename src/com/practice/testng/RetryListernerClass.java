package com.practice.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryListernerClass implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer retry = annotation.getRetryAnalyzer();
		
		if(retry==null)
		{
			annotation.setRetryAnalyzer(RetryFailedTestCases.class);
		}
	}

	

}
