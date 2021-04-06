package com.xworkz.component.entity;

import com.xworkz.component.constant.FoodType;

public class VendorEntity {
private String name;
private  String RestName;
private FoodType foodType;
private double discount;
public VendorEntity(String name, String restName, FoodType foodType, double discount) {
	super();
	System.out.println("Created "+this.getClass().getSimpleName());
	this.name = name;
	RestName = restName;
	this.foodType = foodType;
	this.discount = discount;
}
@Override
public String toString() {
	return "FoodVendor [name=" + name + ", RestName=" + RestName + ", foodType=" + foodType + ", discount=" + discount
			+ "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((RestName == null) ? 0 : RestName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(discount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	VendorEntity other = (VendorEntity) obj;
	if (RestName == null) {
		if (other.RestName != null)
			return false;
	} else if (!RestName.equals(other.RestName))
		return false;
	if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
		return false;
	if (foodType != other.foodType)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRestName() {
	return RestName;
}
public void setRestName(String restName) {
	RestName = restName;
}
public FoodType getFoodType() {
	return foodType;
}
public void setFoodType(FoodType foodType) {
	this.foodType = foodType;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}

}