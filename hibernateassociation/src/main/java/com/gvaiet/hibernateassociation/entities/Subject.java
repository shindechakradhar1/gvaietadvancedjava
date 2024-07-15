package com.gvaiet.hibernateassociation.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {

	@Id
	@Column(name = "subject_id")
	private int subjectId;

	@Column(name = "subject_name")
	private String subjectName;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Teacher> teacherList;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int subjectId, String subjectName, List<Teacher> teacherList) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.teacherList = teacherList;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", teacherList=" + teacherList
				+ "]";
	}

}
