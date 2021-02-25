
public class MessageSubscriberOne implements Observer {

	@Override
	public void update(MessagePublisher msg) {
		System.out.println("MessageSubscriberOne :: " + msg.getMessageContent());

	}

}