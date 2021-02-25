package com.dp.main;

import com.dp.IChatMediator;
import com.dp.IUser;
import com.dp.mediator.ChatMediator;
import com.dp.model.BasicUser;
import com.dp.model.PremiumUser;

public class Main {

	public static void main(String[] args) {

		IChatMediator chatMediator = new ChatMediator();
		IUser user = new BasicUser(chatMediator, "Akki");
		chatMediator.AddUser(user);
		user.SendMessage("Hello");
		
		IUser user2 = new PremiumUser(chatMediator, "Nakul");
		chatMediator.AddUser(user2);
		user2.SendMessage("How Are You");
		
		

	}

}
