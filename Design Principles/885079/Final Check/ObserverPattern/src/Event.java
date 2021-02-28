public class Event {
	private String name;
	private int ticketSold;
	
	public Event(String name, int ticketSold) {
		super();
		this.name = name;
		this.ticketSold = ticketSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTicketSold() {
		return ticketSold;
	}

	public void setTicketSold(int ticketSold) {
		this.ticketSold = ticketSold;
	}

}