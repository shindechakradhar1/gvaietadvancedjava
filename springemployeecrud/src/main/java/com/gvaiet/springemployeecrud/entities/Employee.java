package com.gvaiet.springemployeecrud.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
	@NamedQuery(name="findByName", query = "select e from Employee e join fetch e.address ea where e.name=:name"),
	@NamedQuery(name="findByArea", query = "select e from Employee e join fetch e.address ea where ea.area=:area")
})

@NamedNativeQuery(name="addEmployee", query = "insert into employee(eid, name, age) values(:id, :name, :age)")
public class Employee {
	@Id
	@Min(value = 1, message = "*Employee Id must be Greater than 0")
	private int eId;
	
	@Size(min = 3, max = 15, message = "* Name must be between 3-15 characters")
	private String name;
	
	@Min(value = 18, message = "Age should be greater than 18")
	@Max(value = 35, message="Age shoud be less than 35")
	private int age;
	
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	@Valid
	private EAddress address;

	public Employee() {}

	public Employee(int eId, String name, int age, EAddress address) {
		this.eId = eId;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EAddress getAddress() {
		return address;
	}

	public void setAddress(EAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
