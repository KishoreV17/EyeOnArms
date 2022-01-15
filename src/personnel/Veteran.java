package personnel;


public class Veteran extends Personnel {
	public double pensionAmount;
	public static int veteranCount=0;
	public Veteran(String name, Integer id, Integer accountNumber, Double balance, double pensionAmount)
	{
		super(id, name, accountNumber, balance);
		veteranCount++;
	}
	public Veteran(levelOne officer,double pensionAmount) {
		super(officer.getID(), officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelTwo officer,double pensionAmount) {
		super(officer.getID(),  officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelThree officer,double pensionAmount) {
		super(officer.getID(), officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}
	public Veteran(levelFour officer,double pensionAmount) {
		super(officer.getID(), officer.getName(), officer.getBankaccount());
		this.pensionAmount = pensionAmount;
		this.id = veteranCount++;
	}

	public static int getVeteranCount() {
		return veteranCount;
	}
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

}