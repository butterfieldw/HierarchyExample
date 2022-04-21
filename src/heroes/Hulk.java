package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class Hulk extends Hero {

	public Hulk(String n, String p) {
		super(n, p);
	}

	@Override
	public ArrayList<String> getSpecialAbilities() {
		ArrayList<String> abilitites = new ArrayList<String>();
		return abilitites;
	}

	@Override
	public String getCostume() {
		return "Turns green and rips off shirt";
	}

	@Override
	public String getHomeWorld() {
		return "returns to random country on Earth";
	}
	
}
