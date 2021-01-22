package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Account;
import com.example.demo.models.User;

@RestController
@RequestMapping("users")
public class UserController {
	
	private List<User> users = initUser();
	
	@GetMapping()
	public List<User> findAll(){
		return this.users;
	}
	
	public List<User> initUser(){
		
		List<User> users = new ArrayList<>();
		users.add(new User("DOE","Juan",AccountController.initAccount()));
		users.add(new User("JYRE","Marie",AccountController.initAccount()));
		users.add(new User("MAT","Jean",AccountController.initAccount()));
		users.add(new User("PRYT","Celine",AccountController.initAccount()));
		return users;
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable int id) {
		return this.users.get(id);
	}
	
	@GetMapping("/nom/{nom}")
	public List<User> findByNom(@PathVariable String nom) {
		List<User> userList = new ArrayList<>();
		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getNom().equals(nom)) {
				userList.add(users.get(i));
			}
		}
		return userList;
	}
	
	@PostMapping()
	public User create(@RequestBody User user) {
		this.users.add(user);
		return user;
	}
	
	@PutMapping("/{id}")
	public User update(@PathVariable int id,@RequestBody User user) {
		User newUser = findById(id);
		newUser.setNom(user.getNom());
		newUser.setPrenom(user.getPrenom());
		return newUser;
	}
	
	@DeleteMapping("/{id}")
	public User delete(@PathVariable int id) {
		User user = findById(id);
		this.users.remove(id);
		return user;
	}
}
