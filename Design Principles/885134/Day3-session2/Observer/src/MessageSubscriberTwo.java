
public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(MessagePublisher msg) {
		System.out.println("MessageSubscriberTwo :: " + msg.getMessageContent());
		
	}

}