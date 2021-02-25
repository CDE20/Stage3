
public class MessageSubscriberOne implements Observer {

	@Override
	public void update(MessagePublisher msg) {
		// TODO Auto-generated method stub
		System.out.println("Message Subscriber One : " + msg.getMessageContent());
		
	}

}
