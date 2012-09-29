package com.sanajon.service;

import java.util.List;

import com.sanajon.domain.User;

public interface UserManage {

	public void addUser(User user);
	public void deleteUser(User user);
	public void disableUser(User user);
	public void enableUser(User user);
	public void modifyUser(User user);

	public User getById(int id);
	public User getByName(String name);

	public List<User> getAllUsers();
	public List<User> getByGroup(int groupid);
	public List<User> getByPrivilege(int privilegeid);
	public List<User> getByRole(int roleid);

	public List<User> getByKeyword(String word);
}
