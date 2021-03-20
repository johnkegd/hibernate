package com.johnkegd.hibernate.dao;

import java.util.List;

import com.johnkegd.hibernate.model.Teacher;

public class TeacherDaoImpl extends JohnkegdSession implements TeacherDao {
	
	private JohnkegdSession johnkegdSession;
	
	public TeacherDaoImpl() {
		this.johnkegdSession = new JohnkegdSession();
	}

	@Override
	public void saveTeacher(Teacher teacher) {

		johnkegdSession.getSession().persist(teacher);
		johnkegdSession.getSession().getTransaction().commit();
	}

	@Override
	public List<Teacher> getAllTeachers() {
		
		return johnkegdSession.getSession().createQuery("from Teacher").list();
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
