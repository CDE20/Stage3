package com.atik;

import com.atik.chatmediator.ChatMediator;
import com.atik.interfaces.IChatMediator;
import com.atik.interfaces.IUser;
import com.atik.user.BasicUser;
import com.atik.user.PremiumUser;

public class Main {

	public static void main(String[] args) {
		IChatMediator chatMediator = new ChatMediator();
		IUser user1 = new BasicUser(chatMediator, "ABC");
		chatMediator.AddUser(new BasicUser(chatMediator, "PQR"));
		chatMediator.AddUser(new PremiumUser(chatMediator, "XYZ"));
		chatMediator.AddUser(new PremiumUser(chatMediator, "RST"));
		chatMediator.AddUser(new BasicUser(chatMediator, "HJK"));
		
		user1.sendMessage("Hello Everyone");
	}
	
}	
