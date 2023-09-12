package com.app.services;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.UserDao;
import com.app.entities.User;


@Transactional
@Service
public class UserServiceImpl implements UserService {
	
    @Autowired 
	private UserDao userDao;
    
    //@Autowired
    //private EmailService emailservice;
    
	@Override
	public User findById(int user_id) {
		Optional<User> b = userDao.findById(user_id);
		return b.orElse(null);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User save(User u) {
//		User user = userDao.save(u);
//		ExecutorService executorService=Executors.newSingleThreadExecutor();
//		executorService.submit(()->{
//			emailservice.sendEmailAsync(user.getEmail(), "Registeration","hi"+user.getName().toUpperCase()+"thank you for registering with us!");
//		});
//		//emailservice.sendEmailAsync(user.getEmail(), "Registeration","hi"+user.getName().toUpperCase()+"thank you for registering with us!");
		return userDao.save(u);
	}

	@Override
	public User update(User u) {
		return userDao.save(u);
	}

	@Override
	public void deleteById(int user_id) {
            userDao.deleteById(user_id);

	}

	@Override
	public User authenticate(String email, String password) {
		User user = findByEmail(email);
		if(user != null && user.getPassword().equals(password))
		   return user;
		return null;
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public List<User> findByRole(String role) {
		return userDao.findByRole(role);
	}

}
