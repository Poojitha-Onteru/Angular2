package com.mphasis.MyDemoProject1;


class Parent1{
	int a=3,b=4,sum;
	float avg;
}

class child5 extends Parent1{
	void add() {
		sum=a+b;
		System.out.println("Sum of values="+sum);
	}
}

class child6 extends Parent1{
	void calc() {
		avg=(float)(a+b)/2;
		System.out.println("Avg of values="+avg);
		System.out.println(a+" "+b);
	}
}



public class Hierarical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child5 c1=new child5();
		c1.add();
		child6 c2=new child6();
		c2.calc();

	}

}
