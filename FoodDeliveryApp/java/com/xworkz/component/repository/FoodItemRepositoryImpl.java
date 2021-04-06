package com.xworkz.component.repository;

import com.xworkz.component.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	public FoodItemRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName() );
	}
	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("Invoked save method");
		
	}

}
