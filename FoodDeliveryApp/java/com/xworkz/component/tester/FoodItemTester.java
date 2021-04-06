package com.xworkz.component.tester;

import com.xworkz.component.constant.FoodType;
import com.xworkz.component.entity.FoodItemEntity;
import com.xworkz.component.repository.FoodItemRepository;
import com.xworkz.component.repository.FoodItemRepositoryImpl;
import com.xworkz.component.service.FoodItemService;
import com.xworkz.component.service.FoodItemServiceImpl;

public class FoodItemTester {
public static void main(String[] args) {
	FoodItemEntity entity = new FoodItemEntity("VegBiriyani" , 120.00 , 20, FoodType.CHINEESE );
	FoodItemRepository foodItemRep= new FoodItemRepositoryImpl();
	FoodItemService foodItemService = new FoodItemServiceImpl(foodItemRep);
	foodItemService.ValidationAndSave(entity);
		
		
}
}
