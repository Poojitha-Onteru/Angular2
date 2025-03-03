package Hybernate.Hybernate1;

import javax.persistence.*;
@Entity
public class Student {
	@Id
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private String city;
	public Student() {
		super();
	}
	public Student(int id,String name,String city ) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}

}
