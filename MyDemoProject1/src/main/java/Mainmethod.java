
import java.util.*;
class Employee implements Comparable<Employee>{
	String empname;
	int empid;
	float empsalary;
	public Employee(int id,String name,float sal) {
		this.empid=id;
		this.empname=name;
		this.empsalary=sal;
	}
	public int compareTo(Employee other) {
		return Float.compare(this.empsalary, other.empsalary);
		
	}
	
	public String toString() {
		return empid+"-"+empname+"-"+empsalary+"/-";
	}
}


public class Mainmethod {
	public static void main(String args[]) {
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(121,"jony",85000));
		emp.add(new Employee(122,"poojitha",105000));
		emp.add(new Employee(123,"lila",80500));
		Collections.sort(emp);
		System.out.println("The records after sorting based on salary:");
		for(Employee rec:emp) {
			System.out.println(rec);
		}
		
	}

}
