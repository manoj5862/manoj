package com.xworkz.component.tester;

import com.xworkz.component.constant.FoodType;
import com.xworkz.component.entity.VendorEntity;
import com.xworkz.component.repository.VendorRepository;
import com.xworkz.component.repository.VendorRepositoryImpl;
import com.xworkz.component.service.VenderService;
import com.xworkz.component.service.VendorServiceImpl;

public class VendorTester {
public static void main(String[] args) {
	VendorEntity entity = new VendorEntity("Sunil", "UdupiSagar", FoodType.SOUTHINDIAN, 50);
    VendorRepository repository = new VendorRepositoryImpl();
    VenderService vendorServo = new VendorServiceImpl(repository);
    vendorServo.ValidateAndSave(entity);
}
}
