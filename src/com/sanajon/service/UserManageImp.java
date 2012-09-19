package com.sanajon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanajon.dao.UserDao;
import com.sanajon.domain.User;

@Service
@Transactional(readOnly=true)
public class UserManageImp implements UserManage {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public boolean addUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	@Transactional
	public boolean deleteUser(User user) {
		return userDao.deleteUser(user);
	}

	@Override
	@Transactional
	public boolean disableUser(User user) {
		user.setDisabled(1);
		return userDao.updateUser(user);
	}

	@Override
	@Transactional
	public boolean enableUser(User user) {
		user.setDisabled(0);
		return userDao.updateUser(user);
	}

	@Override
	@Transactional
	public boolean modifyUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public User getByName(String name) {
		return userDao.getByName(name);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public List<User> getByGroup(int groupid) {
		return userDao.getByGroup(groupid);
	}

	@Override
	public List<User> getByKeyword(String word) {
		return userDao.getByKeyword(word);
	}

	@Override
	public List<User> getByPrivilege(int privilegeid) {
		return userDao.getByPrivilege(privilegeid);
	}

	@Override
	public List<User> getByRole(int roleid) {
		return userDao.getByRole(roleid);
	}

}
