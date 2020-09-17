import java.util.Scanner;

import model.*;

public class Runner {
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		Coop coop = new Coop();
		Scanner scan = new Scanner(System.in);
		System.out.println("How old(months) are your chickens?");
		chicken.setAgeMonths(scan.nextInt());
		if (chicken.isAdult(chicken)) {
			System.out.println("Your chickens are old enough to leave the brooder.");
		}
		else {
			System.out.println("Your chickens are not old enough to leave the brooder.");
		}
		System.out.println("How big is your coop in sq. feet?");
		coop.setDimensionSqFt(scan.nextInt());
		if (coop.getSizeCategory(coop) == "small") {
			System.out.println("You can fit 3 chickens in your coop");
		}
		else if (coop.getSizeCategory(coop) == "medium") {
			System.out.println("You can fit 6 chickens in your coop");
		}
		else if (coop.getSizeCategory(coop) == "large") {
			System.out.println("You can fit 9+ chickens in your coop");
		}
	}
}
