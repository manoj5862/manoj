package com.xworkz.component.repository;

import com.xworkz.component.entity.VendorEntity;

public class VendorRepositoryImpl implements VendorRepository {
	
public VendorRepositoryImpl() {
	System.out.println("Created "+this.getClass().getSimpleName());
}
	@Override
	public void save(VendorEntity entity) {
		System.out.println("Invoked Save Method");
		
	}

}
