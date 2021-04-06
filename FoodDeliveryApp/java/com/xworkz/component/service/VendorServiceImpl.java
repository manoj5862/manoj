package com.xworkz.component.service;

import com.xworkz.component.entity.VendorEntity;
import com.xworkz.component.repository.VendorRepository;

public class VendorServiceImpl implements VenderService {
private VendorRepository VendorRepo;

	public VendorServiceImpl(VendorRepository vendorRepo) {
	super();
	System.out.println("Created "+this.getClass().getSimpleName());
	VendorRepo = vendorRepo;
}

	@Override
	public void ValidateAndSave(VendorEntity entity) {
		System.out.println("Invoked ValidateAndSave Method");
		if(entity != null) {
		System.out.println("Can Save Entity");
		VendorRepo.save(entity);
		}else {
			System.out.println("Can't Save Entity");
		}
		
		
	}

}
