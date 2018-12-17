package com.securegatepass.restfulwebservices.securegatepass.supplier;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.securegatepass.restfulwebservices.securegatepass.supplier.SupplierProfile;
import com.securegatepass.restfulwebservices.securegatepass.supplier.SupplierProfileRepository;
import com.securegatepass.restfulwebservices.securegatepass.supplier.SupplierProfile;

@Component

public class SupplierProfileDaoService {

	private static List<SupplierProfile> suppliers = new ArrayList<>(); 
	private static int suppliersCount = 2;

	@Autowired
	SupplierProfileRepository repository;

	public SupplierProfileDaoService() {

	}


	static {
		suppliers.add(new SupplierProfile("12345", "Siddharth", "1234567891", "dfasdf", "pune", "maharashtra", "411041", "GST13434","sidd@gmail.com","123456"));
		suppliers.add(new SupplierProfile("12345", "Siddharth", "1234567891", "dfasdf", "pune", "maharashtra", "411041", "GST13434","sidd@gmail.com","123456"));
	}

	public List<SupplierProfile> getAllSuppliers(){
		return suppliers;
	}

	public SupplierProfile saveSupplier(SupplierProfile supplier) {

		if(supplier.getSID()==null) {
			supplier.setSID(Integer.toString(++suppliersCount));
		}
		suppliers.add(supplier);
		//repository.save(user);
		return supplier;
	}

	public SupplierProfile searchSupplier(int id) {
		for(SupplierProfile supplier : suppliers) {
			if (supplier.getSID().equals(Integer.toString(id))) {
				return supplier;
			}

			//Optional<UserProfile> user = repository.findById(Integer.toString(id));
			//return user;


		}
		return null;

	}
}
