package com.xworkz.component.entity;

import com.xworkz.component.constant.FoodType;

public class CustomerEntity {
private String name;
private double rating;
private String location;
private FoodType orderedFood;
private double price;
public CustomerEntity(String name, double rating, String location, FoodType orderedFood, double price) {
	super();
	System.out.println("Created "+this.getClass().getSimpleName());
	this.name = name;
	this.rating = rating;
	this.location = location;
	this.orderedFood = orderedFood;
	this.price = price;
}
@Override
public String toString() {
	return "Customer1 [name=" + name + ", rating=" + rating + ", location=" + location + ", orderedFood=" + orderedFood
			+ ", price=" + price + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((orderedFood == null) ? 0 : orderedFood.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(rating);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	CustomerEntity other = (CustomerEntity) obj;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (orderedFood != other.orderedFood)
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public FoodType getOrderedFood() {
	return orderedFood;
}
public void setOrderedFood(FoodType orderedFood) {
	this.orderedFood = orderedFood;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
