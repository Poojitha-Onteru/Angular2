package com.mphasis.MyDemoProject1;

public class Employee1 {
	int id;
	String name;
	long salary;
	static char group;
	public Employee1(int id,String name,long salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return getClass()+" name is "+name+" and salary is "+salary;
	}
	
	void incSalary(int per) {
		float inc=salary+(salary*per)/100;
		System.out.println("The salary with 10% increase is "+inc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1(201,"Pooji",30000);
		System.out.println(e1.toString());
		e1.incSalary(10);
		group='A';
		System.out.println("The group of employee "+e1.name+" is "+group);
	}

}
