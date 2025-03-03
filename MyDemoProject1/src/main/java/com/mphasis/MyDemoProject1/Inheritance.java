package com.mphasis.MyDemoProject1;

class Parent{
	double a,b;
	Parent(){}
	Parent(double a,double b){
		this.a=a;
		this.b=b;
	}
}
class child extends Parent{
	child(){
		super(2.1,5.6);
	}
	double area() {
		return a*b;
	}
}
public class Inheritance {
	public static void main(String args[]) {
		child c1=new child();
		System.out.println(c1.area());
	}

}
