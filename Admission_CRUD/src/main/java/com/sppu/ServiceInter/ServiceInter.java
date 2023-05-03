package com.sppu.ServiceInter;

import java.util.List;

import com.sppu.model.Student;

public interface ServiceInter {

	public void savedata(Student s);

	public List<Student> getdata();

	public void deletedata(int id);

}
