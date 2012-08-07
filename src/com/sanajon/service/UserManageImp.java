package com.sanajon.service;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanajon.dao.UserDao;
import com.sanajon.domain.Privilege;
import com.sanajon.domain.User;
import com.sanajon.domain.UserGroup;

@Service
@Transactional
public class UserManageImp implements UserManage {

	@Autowired
	private UserDao userDao;
	
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
		// TODO Auto-generated method stub
		return null;
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
