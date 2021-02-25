public abstract class Subject {

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyUpdate(new Message("State Changed!"));
	}

	public abstract void attach(Observer o);

	public abstract void detach(Observer o);

	public abstract void notifyUpdate(Message m);

}