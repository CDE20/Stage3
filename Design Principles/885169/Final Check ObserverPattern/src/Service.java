
public interface Service {
	public void AddSubscriber(Observer o);
	public void RemoveSubscriber(Observer o);
	public void Notify();

}
