package com.xworkz.component.tester;

import com.xworkz.component.constant.FoodType;
import com.xworkz.component.entity.CustomerEntity;
import com.xworkz.component.repository.CustomerRepository;
import com.xworkz.component.repository.CustomerRepositoryImpl;
import com.xworkz.component.service.CustomerService;
import com.xworkz.component.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity customerEntity = new CustomerEntity("Manoj", 4.5, "Bangalore", FoodType.DESSERTS, 80.00);
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerServiceImpl(customerRepository);
        customerService.ValidateAndSave(customerEntity);
	}

}
