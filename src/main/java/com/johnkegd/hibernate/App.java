package com.johnkegd.hibernate;

import java.util.List;

import com.johnkegd.hibernate.dao.TeacherDaoImpl;
import com.johnkegd.hibernate.model.Teacher;

public class App {

	public static void main(String[] args) {
	
	/*
	Teacher gwendolin = new Teacher("Gwendolin Rotach","avatar");
	teacherDaoImpl.saveTeacher(gwendolin);
	*/
	TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
	List<Teacher> teachersList = teacherDaoImpl.getAllTeachers();
	
	for(Teacher teacher : teachersList) {
		System.out.println(teacher.getName());
		}
	}

}
