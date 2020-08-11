package co.grandcircus;

import java.util.ArrayList;
import java.util.List;

public class SpaceShuttle {

	private int fuel;
	private List<Crew> team;

	public SpaceShuttle() {

		this.fuel = 0;
		this.team = new ArrayList<>();
		team.add(new Crew("John", "Captain"));
		team.add(new Crew("Diddy", "Chimp"));
		team.add(new Crew("Hannah", "Navigator"));
	}

	public boolean isReadyForTakeoff() {

		if (fuel > 5 && this.team.size() == 3) {
			return true;
		}
		return false;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public List<Crew> getTeam() {
		return team;
	}

	public void setTeam(List<Crew> team) {
		this.team = team;
	}

}
