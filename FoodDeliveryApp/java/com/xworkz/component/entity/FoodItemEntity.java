package com.xworkz.component.entity;

import com.xworkz.component.constant.FoodType;

public class FoodItemEntity {
private String name;
private double price;
private int discount;
private FoodType type;
public FoodItemEntity(String name, double price, int discount, FoodType type) {
	super();
	System.out.println("Created "+this.getClass().getSimpleName());
	this.name = name;
	this.price = price;
	this.discount = discount;
	this.type = type;
}
@Override
public String toString() {
	return "FoodItemEntity [name=" + name + ", price=" + price + ", discount=" + discount + ", type=" + type + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + discount;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((type == null) ? 0 : type.hashCode());
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
	FoodItemEntity other = (FoodItemEntity) obj;
	if (discount != other.discount)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (type != other.type)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public FoodType getType() {
	return type;
}
public void setType(FoodType type) {
	this.type = type;
}

}
