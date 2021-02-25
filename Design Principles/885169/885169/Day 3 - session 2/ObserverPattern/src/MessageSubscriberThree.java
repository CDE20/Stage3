
public class MessageSubscriberThree implements Observer {

	@Override
	public void update(MessagePublisher msg) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberThree :: " + msg.getMessageContent());
		
	}

}
