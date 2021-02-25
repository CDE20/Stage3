
public class ProcessPhoneRepair {
	public void RepairSteps(IPhone phone) {
		String part1 = phone.getPhonePart1();
		System.out.println(part1 + " Repaired.");

		double partCost = phone.getPart1Cost();
		System.out.println("Repaired Part Cost " + partCost);
	}
}
