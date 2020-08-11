package co.grandcircus;

import java.util.List;

public class Assessment {

	public static void main(String[] args) {

		SpaceShuttle shuttle = new SpaceShuttle();

		// test with fuel at 0 and 3 crew members
		System.out.println("Test one: ");

		if (shuttle.isReadyForTakeoff()) {
			System.out.println("True - ready for take off.");
		} else {
			System.out.println("False - not ready for take off.");
		}
		System.out
				.println("Fuel is at " + shuttle.getFuel() + " and crew has " + shuttle.getTeam().size() + " members.");

		// test with fuel set at 6 and 3 crew members
		System.out.println("Test two: ");

		shuttle.setFuel(6);

		if (shuttle.isReadyForTakeoff()) {
			System.out.println("True - ready for take off.");
		} else {
			System.out.println("False - not ready for take off.");
		}
		System.out
				.println("Fuel is at " + shuttle.getFuel() + " and crew has " + shuttle.getTeam().size() + " members.");

		// test with fuel still at 6 but add a 4th crew member
		System.out.println("Test three: ");

		List<Crew> team = shuttle.getTeam();
		team.add(new Crew("Maisie", "Astronaut"));

		if (shuttle.isReadyForTakeoff()) {
			System.out.println("True - ready for take off.");
		} else {
			System.out.println("False - not ready for take off.");
		}
		System.out
				.println("Fuel is at " + shuttle.getFuel() + " and crew has " + shuttle.getTeam().size() + " members.");

	}

}
