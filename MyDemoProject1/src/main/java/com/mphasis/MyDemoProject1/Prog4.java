package com.mphasis.MyDemoProject1;

interface Employee{
	void salary();
}

class Emp1 implements Employee{
	float sal;
	String name;
	Emp1(String name,float sal){
		this.name=name;
		this.sal=sal;
	}
	public void salary() {
		System.out.println("The salary of "+name+" is="+sal);
	}
}

class Emp2 implements Employee{
	float sal;
	String name;
	Emp2(String name,float sal){
		this.name=name;
		this.sal=sal;
	}
	public void salary() {
		System.out.println("The salary of "+name+" is="+sal);
	}
}

class Emp3 implements Employee{
	float sal;
	String name;
	Emp3(String name,float sal){
		this.name=name;
		this.sal=sal;
	}
	public void salary() {
		System.out.println("The salary of "+name+" is="+sal);
	}
}


public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Emp1("Jaya",25000);
		e.salary();
		e=new Emp2("lila",90000);
		e.salary();
		e=new Emp3("Tharun",55000);
		e.salary();

	}

}
