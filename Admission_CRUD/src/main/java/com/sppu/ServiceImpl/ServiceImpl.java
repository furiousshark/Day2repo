package com.sppu.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sppu.RepoInter.RepoInter;
import com.sppu.ServiceInter.ServiceInter;
import com.sppu.model.Student;

@Service
public class ServiceImpl implements ServiceInter {

	@Autowired
	private RepoInter ri;

	@Override
	public void savedata(Student s) {

		ri.save(s);

	}

	@Override
	public List<Student> getdata() {

		List<Student> sl = ri.findAll();
		return sl;
	}

	@Override
	public void deletedata(int id) {
		ri.deleteById(id);
		
	}

}
