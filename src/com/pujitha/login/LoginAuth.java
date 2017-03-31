package com.pujitha.login;

import java.util.HashMap;
import com.pujitha.login.dto.*;

public class LoginAuth {
	HashMap<String,String> users = new HashMap<String,String>();
	public LoginAuth()
	{
		users.put("johndoe","John Doe");
		users.put("puji","Pujitha Vallabhaneni");
		users.put("Nikhi","Nikhitha Tarala");	
	}

	public boolean validate(String userName,String password)
	{
		if(userName!=null && password!="")
			return true;
		else
			return false;
	}

	public User getUserDetails(String userId)
	{
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
