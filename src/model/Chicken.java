package model;

public class Chicken {
	private boolean rooster;
	private String color;
	private int ageMonths;
	
	public Chicken() {
		super();
	}
	public Chicken(int ageMonths) {
		super();
		this.ageMonths = ageMonths;
	}

	public boolean isRooster() {
		return rooster;
	}
	public void setRooster(boolean rooster) {
		this.rooster = rooster;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
