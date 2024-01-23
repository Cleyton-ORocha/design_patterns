package com.gihub.cleyton_orocha.builder.meal.after.director;

import com.gihub.cleyton_orocha.builder.meal.after.builder.FastFoodMealBuilder;
import com.gihub.cleyton_orocha.builder.meal.after.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}
	
	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
