package com.design;

import com.design.dependencyinversion.ProcessPhoneRepair;
import com.design.dependencyinversion.Redmi7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone model1=new Redmi7();
		ProcessPhoneRepair processphnrpr=new ProcessPhoneRepair();
		processphnrpr.repairSteps(model1);
	}

}
