package com.gvaiet.hibernateassociation.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {

	@Id
	@Column(name = "teacher_id")
	private int teacherId;

	@Column(name = "teacher_name")
	private String teacherName;

	@ManyToMany(mappedBy = "teacherList")
	private List<Subject> subjectList;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teacherId, String teacherName, List<Subject> subjectList) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subjectList = subjectList;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", subjectList=" + subjectList
				+ "]";
	}

}
