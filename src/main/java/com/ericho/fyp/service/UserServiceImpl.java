package com.ericho.fyp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericho.fyp.dao.UserRepository;
import com.ericho.fyp.model.User;
import com.ericho.fyp.util.StringUtil;

@Service

public class UserServiceImpl implements UserService{
	@Autowired
	public UserRepository userDao;
	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void changePassword(Long id, String originPassword,
			String newPassword) {
		
	}

	@Override
	public boolean checkLogin(String username, String password) {
		User user = this.userDao.findByUsername(username);
		
		return StringUtil.equal(password, user.getPassword());
	}

	@Override
	public void delete(User user) {
		
		userDao.delete(user);
	}

}
