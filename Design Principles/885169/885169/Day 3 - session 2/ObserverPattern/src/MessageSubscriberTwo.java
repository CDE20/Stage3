
public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(MessagePublisher msg) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberTwo :: " + msg.getMessageContent());
		
	}

}
