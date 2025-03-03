package com.mphasis.MyDemoProject1;

class MultiInhe{
	int a,b,c;
	float avg;
}

class child1 extends MultiInhe{
	child1(int i,int j,int k){
		a=i;
		b=j;
		c=j;
	}
	void calc() {
		avg=(a+b+c)/3;
	}
	
}

class child2 extends child1{
	child2(int a,int b,int c){
		super(a,b,c);
	}
	void display() {
		System.out.println("The average value is:"+avg);
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		child2 c=new child2(4,5,6);
		c.calc();
		c.display();
	}
}

