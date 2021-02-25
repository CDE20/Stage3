
public class Main {

	public static void main(String[] args) {

		IPhone phone1 = new SamsungNote();
		IPhone phone2 = new Redmi7();
		
		ProcessPhoneRepair repair = new ProcessPhoneRepair();
		repair.RepairSteps(phone1);
		repair.RepairSteps(phone2);
	}

}
