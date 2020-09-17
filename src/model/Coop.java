package model;

public class Coop {
	private int dimensionSqFt;
	private String color;
	
	public Coop() {
		super();
	}
	public Coop(int dimensionSqFt) {
		super();
		this.dimensionSqFt = dimensionSqFt;
	}

	public int getDimensionSqFt() {
		return dimensionSqFt;
	}
	public void setDimensionSqFt(int dimensionSqFt) {
		this.dimensionSqFt = dimensionSqFt;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getSizeCategory(Coop coop) {
		if (coop.getDimensionSqFt() < 10) {
			return "small";
		}
		else if (coop.getDimensionSqFt() < 20) {
			return "medium";
		}
		else {
			return "large";
		}
	}
}
