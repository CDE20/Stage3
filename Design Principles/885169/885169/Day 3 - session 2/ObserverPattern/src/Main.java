
public class Main {
	public static void main(String[] args)

	{

	MessageSubscriberOne s1 = new MessageSubscriberOne();

	MessageSubscriberTwo s2 = new MessageSubscriberTwo();

	MessageSubscriberThree s3 = new MessageSubscriberThree();

	MessagePublisher p = new MessagePublisher();
	//p.setMessageContent("First Message");

	p.attach(s1);

	p.attach(s2);
	p.attach(s3);
	p.setMessageContent("First Message");

	//p.notifyUpdate(p); //s1 and s2 will receive the update

	p.detach(s1);

	//p.attach(s3);
	p.setMessageContent("Second message");

	//p.notifyUpdate(p);
	}

}
