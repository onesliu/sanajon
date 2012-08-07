package com.sanajon.service;

import java.util.List;

import javax.management.relation.Role;

import com.sanajon.domain.Privilege;
import com.sanajon.domain.User;
import com.sanajon.domain.UserGroup;

public interface UserManage {

	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean disableUser(User user);
	public boolean enableUser(User user);
	public boolean modifyUser(User user);

	public User getById(int id);
	public User getByName(String name);

	public List<User> getAllUsers();
	public List<User> getByGroup(UserGroup group);
	public List<User> getByKeyword(String name);
	public List<User> getByPrivilege(Privilege privilege);
	public List<User> getByRole(Role role);
}
