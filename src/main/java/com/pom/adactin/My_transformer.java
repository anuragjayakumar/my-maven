package com.pom.adactin;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class My_transformer implements IAnnotationTransformer {
	public void transform(ITestAnnotation annotation, Class testClass) {
		//@	Test (retryAnalyse = rerun_putpos.class)
		annotation.setRetryAnalyzer(Rerun_Purpose.class);
		
	}
	
	
	

	
}
