package com.phdareys.spr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.phdareys.spr.service.MealService;

@ComponentScan(basePackages="com.phdareys.spr")
public class MealController {
			// injection de dépendance avec annotation!
	   @Autowired private MealService mealService;

	    public static void main(String[] args) {
	    	AnnotationConfigApplicationContext ctx = 
	    			new AnnotationConfigApplicationContext(MealController.class);
	    	MealController bean = ctx.getBean(MealController.class);
	        System.out.println("Final: " + bean.mealService.getAGoodMeal());
	        ctx.close();
	    }

}
