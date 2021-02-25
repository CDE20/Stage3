package com.atik.interfaces;

import com.atik.model.Message;

public interface Subject {

	void attach(Observer o);
	void detach(Observer o);
	void notifyUpdate(Message m);
	
}
