package com.xworkz.component.repository;

import com.xworkz.component.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	public CustomerRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	@Override
	public void save(CustomerEntity Entity) {
		System.out.println("Invoked Save Method");
		
	}

	
}
