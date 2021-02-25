package com.dp.subject;

import com.dp.observer.Observer;
import com.dp.state.Message;

public interface Subject {

	public void attach(Observer o);

	public void detach(Observer o);

	public void notifyUpdate(Message m);
}
