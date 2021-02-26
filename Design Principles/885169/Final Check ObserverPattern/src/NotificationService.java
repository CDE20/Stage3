import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Service{
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void AddSubscriber(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void RemoveSubscriber(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void Notify() {
		for(Observer o: observers)
		{
			o.notification();
		}
		
	}

}
