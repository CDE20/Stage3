package com.dp.main;

import com.dp.observer.MessageSubscriberOne;
import com.dp.observer.MessageSubscriberThree;
import com.dp.observer.MessageSubscriberTwo;
import com.dp.state.Message;
import com.dp.subject.MessagePublisher;

public class Main {

	public static void main(String[] args) {
		MessageSubscriberOne s1 = new MessageSubscriberOne("OP");

		MessageSubscriberTwo s2 = new MessageSubscriberTwo("Hello");

		MessageSubscriberThree s3 = new MessageSubscriberThree("Why");

		MessagePublisher p = new MessagePublisher();

		p.attach(s1);

		p.attach(s2);

		p.notifyUpdate(new Message("First Message")); // s1 and s2 will receive the update

		p.detach(s1);

		p.attach(s3);

		p.notifyUpdate(new Message("Second Message"));
	}

}
