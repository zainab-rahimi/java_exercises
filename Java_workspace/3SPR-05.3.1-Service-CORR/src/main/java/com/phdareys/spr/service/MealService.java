package com.phdareys.spr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phdareys.spr.entity.Meal;
import com.phdareys.spr.entity.MealCateg;

@Service
public class MealService {
		// j'appelle mon service de livraison qui va faire augmenter le prix!
	@Autowired DeliveryService deliveryService;
	public Meal getAGoodMeal() {	
		Meal m = new Meal("Paella", MealCateg.MAIN, "Spain", 15);
		System.out.println(m);
		m.setCost(m.getCost() +deliveryService.getCost());
		return m;
	}

}
