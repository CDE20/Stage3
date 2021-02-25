package com.dp.mediator;

import java.util.ArrayList;
import java.util.List;

import com.dp.IChatMediator;
import com.dp.IUser;

public class ChatMediator implements IChatMediator {

	List<IUser> users = new ArrayList<>();
	
	public ChatMediator() {
		
	}
	
	@Override
	public void AddUser(IUser user) {
		users.add(user);	
	}

	@Override
	public void SendMessage(IUser user , String msg) {
		// TODO Auto-generated method stub
		
			user.ReceiveMessage(msg);
	}

}
