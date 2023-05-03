package com.sppu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sppu.ServiceInter.ServiceInter;
import com.sppu.model.Student;

@RestController
public class MyController {

	@Autowired
	private ServiceInter si;

	@PostMapping(value = "/savedata")
	public ResponseEntity<Student> savedata(@RequestBody Student s) {
		si.savedata(s);

		return new ResponseEntity<Student>(s, HttpStatus.OK);

	}

	@GetMapping(value = "/getdata")
	public List<Student> getdata() {
		List<Student> sl = si.getdata();

		return sl;

	}

	@PutMapping(value = "/updatedata")
	public String putdata(@RequestBody Student s) {
		si.savedata(s);

		return "update success";
	}

	@DeleteMapping(value = "/deletedata/{id}")
	public String deletedata(@PathVariable int id) {
		si.deletedata(id);
		return "delete success";

	}

}
