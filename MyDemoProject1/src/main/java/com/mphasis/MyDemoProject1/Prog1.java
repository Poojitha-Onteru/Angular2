package com.mphasis.MyDemoProject1;

interface Shape{
	final double pi=3.14;
	void calculateArea();
}

class Circle implements Shape{
	double r;
	Circle(double r){
		this.r=r;
	}
	public void calculateArea() {
		System.out.println("The area of circle="+pi*Math.pow(r, 2));
	}
}

class Rectangle implements Shape{
	float l,b;
	Rectangle(float l,float b){
		this.l=l;
		this.b=b;
	}
	public void calculateArea() {
		System.out.println("The area of rectangle="+l*b);
	}
}

class Triangle implements Shape{
	float b,h;
	Triangle(float b,float h){
		this.b=b;
		this.h=h;
	}
	public void calculateArea() {
		System.out.println("The area of Triangle="+(1/2)*b*h);
	}
}


public class Prog1 {
	public static void main(String args[]) {
		Circle c=new Circle(3);
		c.calculateArea();
		Rectangle r=new Rectangle(2,3);
		r.calculateArea();
		Triangle t=new Triangle(4,5);
		t.calculateArea();
	}

}
