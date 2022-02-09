package com.bridgelabz.day6.workshop;

class Car{
	
	private int speed;
	private double regularPrice;
	private String color;
	
	public Car(int speed, double regularPrice, String color) {
		
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	double getSalePrice() {
		
		return regularPrice;
		
	}
	
}
class Truck extends Car{
	
	private int weight;
	public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight=weight;
	}

	double getSalePrice() {
		
		  return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80);
	}
}

class Ford extends Car{
	
	private int year;
	private int manufacturerDiscount;
	public Ford(int speed, double regularPrice, String color,int year,int manufacturerDiscount) {
		super(speed, regularPrice, color);
		 this.year = year;
	        this.manufacturerDiscount = manufacturerDiscount;
	}
	
	double getSalePrice() {
		return super.getSalePrice()- manufacturerDiscount;
		
	}
}


class Sedan extends Car{
	private int length;
	public Sedan(int speed, double regularPrice, String color,int length) {
		super(speed, regularPrice, color);
		this.length=length;
	}
	
	double getSalePrice() {
		return super.getSalePrice() * (length >20 ? 0.95 : 0.9);
		
	}
}

public class MyOwnAutoShop {
public static void main(String[] args) {
	
   Sedan s=new Sedan(500, 500,"red",30);
   
   Ford f1=new Ford(300, 300, "black",2021,50);
   
   Ford f2=new Ford(250, 250, "yellow",2022,40);
   
   Car c=new Car(200, 200, "blue");
   
   System.out.println("Sedan salesprice is "+s.getSalePrice());
   
   System.out.println("Ford 1 salesprice is "+f1.getSalePrice());
   
   System.out.println("Ford 2 salesprice is "+f2.getSalePrice());
   
   System.out.println("Car salesprice is "+c.getSalePrice());
   

}
}
