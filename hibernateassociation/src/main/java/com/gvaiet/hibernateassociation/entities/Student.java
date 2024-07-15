package com.gvaiet.hibernateassociation.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@Column(name = "student_id")
	private int studentId;

	@Column(name = "student_name")
	private String studentName;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
//	@JoinColumn(name="s_id")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="std_sub", 
			joinColumns = {@JoinColumn(name="std_id")}, 
			inverseJoinColumns = {@JoinColumn(name="sub_id")}
	)
	private List<Subject> subjectList;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, Address address, List<Subject> subjectList) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.subjectList = subjectList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", subjectList=" + subjectList + "]";
	}

}
