package model;

public class Chicken {

	private int ageMonths;
	
	public Chicken() {
		super();
	}
	public Chicken(int ageMonths) {
		super();
		this.ageMonths = ageMonths;
	}
	public int getAgeMonths() {
		return ageMonths;
	}
	public void setAgeMonths(int ageMonths) {
		this.ageMonths = ageMonths;
	}
	
	public boolean isAdult(Chicken chicken) {
		if (chicken.getAgeMonths() >= 3) {
			return true;
		}
		else {
			return false;
		}
	}
}
