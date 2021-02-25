
public interface Subject {
	public void attach(Observer o);

	public void detach(Observer o);

	void notifyUpdate(MessagePublisher msg);

}