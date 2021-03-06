package com.ericho.fyp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="login_consumer")
public class LoginConsumer {
	@Id
	@GeneratedValue()
	private int cid ;
	
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
}
