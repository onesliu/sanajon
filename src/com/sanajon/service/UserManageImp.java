package com.sanajon.service;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanajon.domain.Privilege;
import com.sanajon.domain.User;
import com.sanajon.domain.UserGroup;

@Service
@Transactional
public class UserManageImp implements UserManage {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disableUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> allUsers = new ArrayList<User>();
		User user = new User();
		user.setName("张三");
		allUsers.add(user);
		user = new User();
		user.setName("李四");
		allUsers.add(user);
		return allUsers;
	}

	@Override
	public List<User> getByGroup(UserGroup group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getByKeyword(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getByPrivilege(Privilege privilege) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getByRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

}
