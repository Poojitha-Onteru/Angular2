package com.mphasis.MyDemoProject1;

public interface Area1 {
	final double pi=3.14;
	double areaCircle();
}

class Imple implements Area1{
	double r;
	Imple(double r){
		this.r=r;
	}
	public double areaCircle() {
		return pi*Math.pow(r, 2);
	}
}
class Main{
	public static void main(String args[]) {
		Imple imp1=new Imple(3);
		System.out.println(imp1.areaCircle());
	}
}
