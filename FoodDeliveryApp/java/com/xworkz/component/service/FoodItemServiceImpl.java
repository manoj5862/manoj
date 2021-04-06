package com.xworkz.component.service;

import com.xworkz.component.entity.FoodItemEntity;
import com.xworkz.component.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService {
private FoodItemRepository foodItemRep;

	public FoodItemServiceImpl(FoodItemRepository foodItemRep) {
	super();
	System.out.println("Created "+this.getClass().getSimpleName());
	this.foodItemRep = foodItemRep;
}


	@Override
	public void ValidationAndSave(FoodItemEntity entity) {
		System.out.println("Invoked ValidationAndSave method");
		if(entity != null) {
			System.out.println("Can Save Entity");
			foodItemRep.save(entity);
		}else {
			System.out.println("Can't save entity");
		}
	}

}
