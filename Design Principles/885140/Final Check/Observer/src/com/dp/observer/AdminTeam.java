package com.dp.observer;

import com.dp.INotificationObserver;

public class AdminTeam implements INotificationObserver {

	public AdminTeam(){
		
	}
	@Override
	public void onHundredTicketsBooked() {
		
		System.out.println("Hundered Tickets have been booked");

	}

}
