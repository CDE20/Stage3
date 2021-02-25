package com.dp;

public interface IChatMediator {

	void AddUser(IUser user);
	void SendMessage(IUser user, String msg);
}
